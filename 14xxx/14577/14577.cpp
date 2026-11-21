#include<bits/stdc++.h>
using namespace std;

const int MAX = 300'000;

long long _size, arr[MAX*4], h[MAX/3];
set<long long> hList;
map<long long, int> hToIdx;
map<int, long long> idxToH;

struct opt {
    long long a, b, c;
};

vector<opt> opts(MAX/3);

void init(int n, int m) {
    _size=1;
    while(_size<MAX) _size<<=1;
    _size<<=1;

    // 나올 수 있는 모든 높이 뽑아내기
    for(int i=0;i<n;i++) {
        cin >> h[i];
        hList.insert(h[i]);
    }

    for(int i=0;i<m;i++) {
        opt &cur = opts[i];
        cin >> cur.a >> cur.b;
        if(cur.a!=4) cin >> cur.c;

        if(cur.a==1) {
            h[cur.b-1] += cur.c;
            hList.insert(h[cur.b-1]);
        } else if(cur.a==2) {
            h[cur.b-1] -= cur.c;
            hList.insert(h[cur.b-1]);
        } else if(cur.a==3) {
            hList.insert(cur.b);
            hList.insert(cur.c);
        }
    }

    // 각 높이 순서대로 인덱싱 (좌표 압축)
    int idx=0;
    for(long long e:hList) {
        hToIdx[e] = idx;
        idxToH[idx] = e;
        idx++;
    }

    // 높이 처음으로 되돌리기
    for(int i=0;i<m;i++) {
        opt cur = opts[i];
        if(cur.a==1) {
            h[cur.b-1] -= cur.c;
        } else if(cur.a==2) {
            h[cur.b-1] += cur.c;
        }
    }

    // 세그먼트 트리 구축
    for(int i=0;i<n;i++) {
        arr[_size/2+hToIdx[h[i]]]++;
    }
    for(int i=_size/2-1;i>0;i--) {
        arr[i] = arr[i*2] + arr[i*2+1];
    }
}

void update(int i, long long val) {
    int nodeNum = _size/2+i;
    arr[nodeNum] += val;
    while(nodeNum>1) {
        nodeNum>>=1;
        arr[nodeNum] = arr[nodeNum*2] + arr[nodeNum*2+1];
    }
}

long long getCnt(int L, int R, int nodeNum=1, int nodeL=0, int nodeR=_size/2-1) {
    if(R<nodeL || nodeR<L) return 0;
    if(L<=nodeL && nodeR<=R) return arr[nodeNum];
    int mid = (nodeL+nodeR)/2;
    return getCnt(L, R, nodeNum*2, nodeL, mid) + getCnt(L, R, nodeNum*2+1, mid+1, nodeR);
}

void findBig(int nodeNum, int nodeL, int nodeR, long long k) {
    if(nodeL==nodeR) {
        cout << idxToH[nodeL] << '\n';
        return;
    }
    int mid = (nodeL+nodeR)/2;
    if(arr[nodeNum*2+1]<k) findBig(nodeNum*2, nodeL, mid, k-arr[nodeNum*2+1]);
    else findBig(nodeNum*2+1, mid+1, nodeR, k);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    init(n, m);

    for(int i=0;i<m;i++) {
        opt cur = opts[i];
        if(cur.a==1) {
            // 기존 높이 지우고 새 높이 추가
            update(hToIdx[h[cur.b-1]], -1);
            h[cur.b-1] += cur.c;
            update(hToIdx[h[cur.b-1]], 1);
        } else if(cur.a==2) {
            // 기존 높이 지우고 새 높이 추가
            update(hToIdx[h[cur.b-1]], -1);
            h[cur.b-1] -= cur.c;
            update(hToIdx[h[cur.b-1]], 1);
        } else if(cur.a==3) {
            // 왼쪽 끝과 오른쪽 끝 사이에 포함되는 개수
            cout << getCnt(hToIdx[cur.b], hToIdx[cur.c]) << '\n';
        } else {
            // cur.b번째로 높은 높이 찾기
            findBig(1, 0, _size/2-1, cur.b);
        }
    }
}
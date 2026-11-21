#include<bits/stdc++.h>
using namespace std;

typedef pair<int, int> P;
const int MAX = 75000*3;
int _size=1, arr[MAX];

bool comp1(P a, P b) {
    return a.second>b.second || a.second==b.second && a.first<b.first;
}

bool comp2(P a, P b) {
    return a.first<b.first || a.first==b.first && a.second>b.second;
}

void update(int y) {
    int nodeNum = _size/2+y;
    arr[nodeNum]++;
    while(nodeNum>1) {
        nodeNum>>=1;
        arr[nodeNum] = arr[nodeNum*2]+arr[nodeNum*2+1];
    }
}

int getCnt(int L, int R, int nodeNum, int nodeL, int nodeR) {
    if(R<nodeL || nodeR<L) return 0;
    if(L<=nodeL && nodeR<=R) return arr[nodeNum];
    int mid = (nodeL+nodeR)/2;
    return getCnt(L, R, nodeNum*2, nodeL, mid) + getCnt(L, R, nodeNum*2+1, mid+1, nodeR);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    while(_size<75000) _size<<=1;
    _size<<=1;

    int t; cin >> t;
    while(t--) {
        int n; cin >> n;
        memset(arr, 0, sizeof arr);

        vector<P> v(n);
        for(int i=0;i<n;i++) cin >> v[i].first >> v[i].second;

        // y좌표 재설정
        sort(v.begin(), v.end(), comp1);
        int cnt=75000;
        for(int i=0;i<n;i++) {
            v[i].second = --cnt;
        }

        // x좌표가 작은 순, y좌표가 높은 순으로 순서대로 넣기
        long long total=0;
        sort(v.begin(), v.end(), comp2);
        for(auto p:v) {
            total += getCnt(p.second, 75000, 1, 0, _size/2-1);
            update(p.second);
        }
        cout << total << '\n';
    }
}
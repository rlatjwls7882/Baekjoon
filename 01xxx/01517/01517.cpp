#include<bits/stdc++.h>
using namespace std;

const int MAX = 1'500'000;
int _size=1, arr[MAX];

void update(int idx) {
    int nodeNum = _size/2+idx;
    arr[nodeNum]=1;
    while(nodeNum>1) {
        nodeNum>>=1;
        arr[nodeNum] = arr[nodeNum*2] + arr[nodeNum*2+1];
    }
}

long long search(int L, int R, int nodeNum, int nodeL, int nodeR) {
    if(R<nodeL || nodeR<L) return 0;
    if(L<=nodeL && nodeR<=R) return arr[nodeNum];
    int mid = (nodeL+nodeR)/2;
    return search(L, R, nodeNum*2, nodeL, mid) + search(L, R, nodeNum*2+1, mid+1, nodeR);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    vector<pair<int, int>> v(n);
    for(int i=0;i<n;i++) {
        cin >> v[i].first;
        v[i].second=i;
    }
    sort(v.begin(), v.end(), greater<pair<int, int>>());

    while(_size<n) _size<<=1;
    _size<<=1;

    long long cnt=0;
    for(int i=0;i<n;i++) {
        cnt += search(0, v[i].second-1, 1, 0, _size/2-1);
        update(v[i].second);
    }
    cout << cnt;
}
#include<bits/stdc++.h>
using namespace std;

const int MAX = 400'001;

int _size=1;
vector<vector<int>> arr(MAX);

int getCnt(int L, int R, int val, int nodeNum=1, int nodeL=0, int nodeR=_size/2-1) {
    if(R<nodeL || nodeR<L) return 0;
    if(L<=nodeL && nodeR<=R) return arr[nodeNum].end() - upper_bound(arr[nodeNum].begin(), arr[nodeNum].end(), val);
    int mid = (nodeL+nodeR)/2;
    return getCnt(L, R, val, nodeNum*2, nodeL, mid) + getCnt(L, R, val, nodeNum*2+1, mid+1, nodeR);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    while(_size<n) _size<<=1;
    _size<<=1;

    for(int i=_size/2;i<_size/2+n;i++) {
        int a; cin >> a;
        arr[i].push_back(a);
    }
    for(int i=_size/2-1;i>0;i--) {
        int l=0, r=0;
        while(l<arr[i*2].size() || r<arr[i*2+1].size()) {
            if(r>=arr[i*2+1].size() || l<arr[i*2].size() && arr[i*2][l]<arr[i*2+1][r]) arr[i].push_back(arr[i*2][l++]);
            else arr[i].push_back(arr[i*2+1][r++]);
        }
    }

    int m; cin >> m;
    while(m--) {
        int i, j, k; cin >> i >> j >> k;
        cout << getCnt(i-1, j-1, k) << '\n';
    }
}
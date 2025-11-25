#include<bits/stdc++.h>
using namespace std;

const int MAX = 100'001;

int _size=1;
vector<vector<int>> arr(MAX*4);

int query(int L, int R, int val) {
    int ret=0;
    for(L+=_size, R+=_size;L<=R;L>>=1, R>>=1) {
        if(L&1) ret += upper_bound(arr[L].begin(), arr[L].end(), val) - arr[L].begin(), L++;
        if(!(R&1)) ret += upper_bound(arr[R].begin(), arr[R].end(), val) - arr[R].begin(), R--;
    }
    return ret;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    while(_size<n) _size<<=1;
    for(int i=_size+1;i<=_size+n;i++) {
        int a; cin >> a;
        arr[i].push_back(a);
    }
    for(int i=_size-1;i>=1;i--) {
        int l=0, r=0;
        while(l<arr[i*2].size() || r<arr[i*2+1].size()) {
            if(l==arr[i*2].size() || r<arr[i*2+1].size() && arr[i*2+1][r]<arr[i*2][l]) arr[i].push_back(arr[i*2+1][r++]);
            else arr[i].push_back(arr[i*2][l++]);
        }
    }

    while(m--) {
        int i, j, k; cin >> i >> j >> k;

        int left=-1e9, right=1e9;
        while(left<right) {
            int mid = left+right>>1;
            if(query(i, j, mid)<k) left=mid+1;
            else right=mid;
        }
        cout << left << '\n';
    }
}
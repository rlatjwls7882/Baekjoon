#include<bits/stdc++.h>
using namespace std;

const int MAX = 100'001;

int _size=1;
vector<vector<int>> arr(MAX*4);

int query(int L, int R, int val) {
    int ret=0;
    for(L+=_size, R+=_size;L<=R;L>>=1, R>>=1) {
        if(L&1) ret += arr[L].end() - upper_bound(arr[L].begin(), arr[L].end(), val), L++;
        if(!(R&1)) ret += arr[R].end() - upper_bound(arr[R].begin(), arr[R].end(), val), R--;
    }
    return ret;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    while(_size<n) _size<<=1;

    for(int i=_size+1;i<=_size+n;i++) {
        int A; cin >> A;
        arr[i].push_back(A);
    }

    for(int i=_size-1;i>=1;i--) {
        int l=0, r=0;
        while(l<arr[i*2].size() || r<arr[i*2+1].size()) {
            if(l==arr[i*2].size() || r<arr[i*2+1].size() && arr[i*2+1][r]<arr[i*2][l]) arr[i].push_back(arr[i*2+1][r++]);
            else arr[i].push_back(arr[i*2][l++]);
        }
    }

    int lastAns=0;
    int m; cin >> m;
    while(m--) {
        int a, b, c; cin >> a >> b >> c;
        int i = a^lastAns;
        int j = b^lastAns;
        int k = c^lastAns;
        lastAns = query(i, j, k);
        cout << lastAns << '\n';
    }
}
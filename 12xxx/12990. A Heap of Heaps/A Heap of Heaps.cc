#include<bits/stdc++.h>
using namespace std;

const int MAX = 200'001;

int n, _size=1;
vector<vector<int>> arr(MAX*4);

int query(int L, int R, int k) {
    if(L>n) return 0;
    R = min(n, R);
    int ret=0;
    for(L+=_size, R+=_size;L<=R;L>>=1, R>>=1) {
        if(L&1) ret += lower_bound(arr[L].begin(), arr[L].end(), k) - arr[L].begin(), L++;
        if(!(R&1)) ret += lower_bound(arr[R].begin(), arr[R].end(), k) - arr[R].begin(), R--;
    }
    return ret;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n;
    while(_size<n) _size<<=1;
    for(int i=1;i<=n;i++) {
        int val; cin >> val;
        arr[i+_size].push_back(val);
    }
    for(int i=_size-1;i>0;i--) {
        int l=0, r=0;
        while(l<arr[i*2].size() || r<arr[i*2+1].size()) {
            if(l==arr[i*2].size() || r<arr[i*2+1].size() && arr[i*2+1][r]<arr[i*2][l]) arr[i].push_back(arr[i*2+1][r++]);
            else arr[i].push_back(arr[i*2][l++]);
        }
    }

    for(int k=1;k<=n-1;k++) {
        long long cnt=0;
        for(int j=1;k*(j-1)+1<=n;j++) {
            cnt += query(k*(j-1)+2, k*j+1, arr[j+_size][0]);
        }
        cout << cnt << ' ';
    }
}
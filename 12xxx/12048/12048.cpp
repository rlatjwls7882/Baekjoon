#include<bits/stdc++.h>
using namespace std;

int a[1000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    for(int tc=1;tc<=t;tc++) {
        int n, q; cin >> n >> q;
        for(int i=0;i<n;i++) cin >> a[i];
        vector<int> sum;
        for(int i=0;i<n;i++) for(int j=i;j<n;j++) sum.push_back(accumulate(a+i, a+j+1, 0));
        sort(sum.begin(), sum.end());

        cout << "Case #" << tc << ":\n";
        while(q--) {
            int l, r; cin >> l >> r;
            cout << accumulate(sum.begin()+l-1, sum.begin()+r, 0LL) << '\n';
        }
    }
}
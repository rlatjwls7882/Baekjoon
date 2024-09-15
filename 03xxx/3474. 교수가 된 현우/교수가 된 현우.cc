#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t; cin >> t;
    
    while(t-->0) {
        int n; cin >> n;
        int cnt=0;
        for(int i=5;i<=n;i*=5) {
            cnt += n/i;
        }
        cout << cnt << '\n';
    }
}
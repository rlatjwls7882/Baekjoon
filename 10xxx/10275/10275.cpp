#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t; cin >> t;
    while(t-->0) {
        long long n, a, b; cin >> n >> a >> b;
        n = powl(2, n-1);

        int cnt=0;
        while(a!=0) {
            if(n<=a) a-=n;
            n/=2;
            cnt++;
        }
        cout << cnt << '\n';
    }
}

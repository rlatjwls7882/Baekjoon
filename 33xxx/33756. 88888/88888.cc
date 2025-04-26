#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        long long n; cin >> n;
        long long pal = 888'888'888'888'888'888;
        int cnt=0;
        while(n && cnt<8) {
            if(n>=pal) {
                n -= pal;
                cnt++;
            } else {
                pal /= 10L;
            }
        }
        if(n==0 && cnt<=8) cout << "Yes\n";
        else cout << "No\n";
    }
}
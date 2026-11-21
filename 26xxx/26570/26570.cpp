#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t; cin >> t;
    while(t-->0) {
        int n; cin >> n;
        int sum=0;
        bool chk=false;
        for(int i=n/2;i>=1;i--) {
            if(n%i==0 && sum+i<=n) {
                sum += i;
                if(sum==n) {
                    chk=true;
                    break;
                }
            }
        }
        if(chk) cout << "Semiperfect\n";
        else cout << "NOT Semiperfect\n";
    }
}
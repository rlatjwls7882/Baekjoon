#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t;  cin >> t;
    while(t-->0) {
        int n, x, y; cin >> n >> x >> y;
        double maxV=0, curV;
        for(int i=0;i<n;i++) {
            cin >> curV;
            if(i!=n-1) maxV = max(maxV, curV);
        }

        bool chk=false;
        for(int i=0;i<=y;i++) {
            if((x-i)/curV + (i?1:0) < x/maxV) {
                chk=true;
                cout << i << '\n';
                break;
            }
        }
        if(!chk) cout << "-1\n";
    }
}
#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    while(true) {
        int n; cin >> n;
        if(cin.fail()) break;

        int last; cin >> last;
        bool chk[n] = {false, };
        for(int i=0;i<n-1;i++) {
            int cur; cin >> cur;
            chk[abs(cur-last)]=true;
            last=cur;
        }

        bool isJolly=true;
        for(int i=1;i<n;i++) {
            if(!chk[i]) {
                isJolly=false;
                break;
            }
        }

        if(isJolly) cout << "Jolly\n";
        else cout << "Not jolly\n";
    }
}
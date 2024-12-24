#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    for(int t=1;;t++) {
        int s, c, p, l; cin >> s >> c >> p >> l;
        if(!s && !c && !p && !l) return 0;

        int firstP=p, firstL=l;
        for(int cnt=1;;cnt++) {
            p = (p+1)%s;
            l = (l+1)%c;
            if(p==firstP && l==firstL) {
                cout << "Case " << t << ": Never\n";
                break;
            } else if(!p && !l) {
                cout << "Case " << t << ": " << cnt/s << ' ' << cnt%s << "/" << s << '\n';
                break;
            }
        }
    }
}
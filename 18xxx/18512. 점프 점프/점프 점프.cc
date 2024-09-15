#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int X, Y, P1, P2; cin >> X >> Y >> P1 >> P2;
    int cnt1=0, cnt2=0;
    while(P1!=P2) {
        if(P1<P2) {
            P1+=X;
            cnt1++;
        } else if(P2<P1) {
            P2+=Y;
            cnt2++;
        }
        if(cnt1>=100 || cnt2>=100) {
            cout << -1;
            return 0;
        }
    }
    cout << P1;
}
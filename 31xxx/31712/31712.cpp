#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int Cu, Du; cin >> Cu >> Du;
    int Cd, Dd; cin >> Cd >> Dd;
    int Cp, Dp; cin >> Cp >> Dp;
    int H; cin >> H;

    for(int i=0;;i++) {
        if(i%Cu==0) {
            H -= Du;
        }
        if(i%Cd==0) {
            H -= Dd;
        }
        if(i%Cp==0) {
            H -= Dp;
        }
        
        if(H<=0) {
            cout << i;
            break;
        }
    }
}
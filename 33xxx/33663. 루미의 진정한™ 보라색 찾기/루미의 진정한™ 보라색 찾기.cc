#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int hLo, hHi, sLo, sHi, vLo, vHi, R, G, B; cin >> hLo >> hHi >> sLo >> sHi >> vLo >> vHi >> R >> G >> B;
    
    double V = max({R, G, B});
    double m = min({R, G, B});

    double S = 255*(V-m)/V;
    double H;

    if(V==R) {
        H = 60*(G-B)/(V-m);
    } else if(V==G) {
        H = 120 + 60*(B-R)/(V-m);
    } else {
        H = 240 + 60*(R-G)/(V-m);
    }
    if(H<0) H+=360;

    if(hLo<=H && H<=hHi && sLo<=S && S<=sHi && vLo<=V && V<=vHi) cout << "Lumi will like it.";
    else cout << "Lumi will not like it.";
}
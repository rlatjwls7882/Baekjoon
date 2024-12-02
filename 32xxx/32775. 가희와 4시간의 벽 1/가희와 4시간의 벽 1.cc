#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int Sab, Fab; cin >> Sab >> Fab;
    if(Sab<=Fab) cout << "high speed rail";
    else cout << "flight";
}
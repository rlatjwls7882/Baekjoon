#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int Sab, Ma, Fab, Mb; cin >> Sab >> Ma >> Fab >> Mb;
    if(Sab<=Ma+Fab+Mb || Sab<=240) cout << "high speed rail";
    else cout << "flight";
}
#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int Sx, Sy, Ex, Ey, Px, Py; cin >> Sx >> Sy >> Ex >> Ey >> Px >> Py;
    if(Sx==Ex && Sx==Px && (Sy<Py && Py<Ey || Ey<Py && Py<Sy) || Sy==Ey && Sy==Py && (Sx<Px && Px<Ex || Ex<Px && Px<Sx)) cout << 2;
    else if(Sx==Ex || Sy==Ey) cout << 0;
    else cout << 1;
}
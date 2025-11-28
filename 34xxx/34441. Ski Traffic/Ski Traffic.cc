#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    string tmpS; getline(cin, tmpS);
    int h, m; char tmpC; cin >> h >> tmpC >> m;
    m+=h*60;

    cin >> tmpS;
    if(tmpS=="sat" || tmpS=="sun") m*=2;
    cin >> tmpS;
    if(tmpS=="1") m*=2;
    cin >> tmpS;
    if(tmpS=="1") m*=3;
    cin >> tmpS;
    if(tmpS=="1") m*=3;

    cout << m/60 << ":";
    if(m%60<10) cout << "0";
    cout << m%60;
}
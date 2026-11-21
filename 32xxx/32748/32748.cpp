#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int fx[10], fInverseX[10];
    for(int i=0;i<10;i++) cin >> fx[i], fInverseX[fx[i]]=i;

    string fA, fB; cin >> fA >> fB;
    string A="", B="";
    for(int i=0;i<fA.length();i++) A += fInverseX[fA[i]-'0']+'0';
    for(int i=0;i<fB.length();i++) B += fInverseX[fB[i]-'0']+'0';

    string AplusB = to_string(stoi(A)+stoi(B));
    for(int i=0;i<AplusB.length();i++) cout << fx[AplusB[i]-'0'];
}
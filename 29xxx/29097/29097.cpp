#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, m, k, a, b, c; cin >> n >> m >> k >> a >> b >> c;
    int A=n*a, B=m*b, C=k*c;
    if(A>=B && A>=C) cout << "Joffrey ";
    if(B>=A && B>=C) cout << "Robb ";
    if(C>=A && C>=B) cout << "Stannis";
}
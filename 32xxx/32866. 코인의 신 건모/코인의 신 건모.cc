#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    double N, X; cin >> N >> X;
    cout << setprecision(6) << fixed << (N/((100-X)*N/100)-1)*100;
}
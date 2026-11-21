#include<bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;

    int minPackageVal=INT_MAX, minPieceVal=INT_MAX;
    while(M-->0) {
        int a, b; cin >> a >> b;
        minPackageVal = min(minPackageVal, a);
        minPieceVal = min(minPieceVal, b);
    }
    cout << min(min((N+5)/6*minPackageVal, N*minPieceVal), N/6*minPackageVal+N%6*minPieceVal);
}
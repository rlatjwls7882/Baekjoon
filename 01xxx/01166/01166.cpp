#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    long long N, L, W, H; cin >> N >> L >> W >> H;

    long double Afirst=0.0000000001, Alast=1000000000;
    while(true) {
        if(Afirst+0.0000000001>Alast) break;
        long double mid = (Afirst+Alast)/2;
        long long cur = (long long)(L/mid)*(long long)(W/mid)*(long long)(H/mid);
        if(cur>=N) Afirst = mid;
        else Alast = mid-0.0000000001;
    }
    cout << setprecision(9) << fixed << Afirst;
}
#include<bits/stdc++.h>
using namespace std;

int minDiff=1000, n, r[30], g[30], b[30], Rg, Gg, Bg;

void back(int depth=0, int start=0, int rSum=0, int gSum=0, int bSum=0) {
    if(depth>=2) minDiff = min(minDiff, abs(Rg-rSum/depth)+abs(Gg-gSum/depth)+abs(Bg-bSum/depth));
    if(depth==7) return;

    for(int i=start;i<n;i++) {
        back(depth+1, i+1, rSum+r[i], gSum+g[i], bSum+b[i]);
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n;
    for(int i=0;i<n;i++) cin >> r[i] >> g[i] >> b[i];
    cin >> Rg >> Gg >> Bg;
    back();
    cout << minDiff;
}
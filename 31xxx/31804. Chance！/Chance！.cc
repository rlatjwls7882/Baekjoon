#include<bits/stdc++.h>
using namespace std;

int minDist[1'000'001][2];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int a, b; cin >> a >> b;

    fill(&minDist[0][0], &minDist[1'000'000][2], 1'000'000);
    minDist[a][0]=0;
    for(int i=1;i<b;i++) {
        if(i*10<=b) minDist[i*10][1] = min(minDist[i*10][1], minDist[i][0]+1);
        for(int j=0;j<2;j++) {
            minDist[i+1][j] = min(minDist[i+1][j], minDist[i][j]+1);
            if(i*2<=b) minDist[i*2][j] = min(minDist[i*2][j], minDist[i][j]+1);
        }
    }
    cout << min(minDist[b][0], minDist[b][1]);
}
#include<bits/stdc++.h>
using namespace std;

int N, K;
int totalMax_min=INT_MAX;
int house[50][2], shelter[3][2];

void back(int depth, int start) {
    if(depth==K) {
        int curMax=INT_MIN;
        for(int i=0;i<N;i++) {
            int diff=INT_MAX;
            for(int j=0;j<K;j++) diff = min(diff, abs(shelter[j][0]-house[i][0])+abs(shelter[j][1]-house[i][1]));
            curMax = max(curMax, diff);
        }
        totalMax_min = min(totalMax_min, curMax);
        return;
    }

    for(int i=start;i<N;i++) {
        shelter[depth][0] = house[i][0];
        shelter[depth][1] = house[i][1];
        back(depth+1, i+1);
    }
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> N >> K;
    for(int i=0;i<N;i++) cin >> house[i][0] >> house[i][1];
    back(0, 0);
    cout << totalMax_min;
}
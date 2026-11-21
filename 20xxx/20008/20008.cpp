#include<bits/stdc++.h>
using namespace std;

int N, HP, minT=INT_MAX;
int D[5], cool[5], canUse[5] = {0, };
void back(int t, int damage) {
    if(damage>=HP) {
        minT = min(minT, t);
        return;
    }

    for(int i=0;i<N;i++) {
        int tmp = canUse[i];
        canUse[i]=max(t, canUse[i])+cool[i];
        back(canUse[i]-cool[i]+1, damage+D[i]);
        canUse[i]=tmp;
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> N >> HP;
    for(int i=0;i<N;i++) {
        cin >> cool[i] >> D[i];
    }
    back(0, 0);
    cout << minT;
}
#include<bits/stdc++.h>
using namespace std;

int oven[300000], minSize[300000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int D, N; cin >> D >> N;
    for(int i=0;i<D;i++) {
        cin >> oven[i];
        minSize[i] = oven[i]; // 0~i까지의 최소 지름
        if(i>=1) minSize[i] = min(minSize[i], minSize[i-1]);
    }

    int last=D-1;
    while(N-->0) {
        int pizza; cin >> pizza;
        while(last>=0 && pizza>minSize[last]) {
            last--;
        }
        if(last<0) {
            cout << 0;
            return 0;
        }
        minSize[last]=0;
    }
    cout << last+1;
}
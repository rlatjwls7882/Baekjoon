#include<bits/stdc++.h>
using namespace std;

int oven[300000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int D, N; cin >> D >> N;
    for(int i=0;i<D;i++) {
        cin >> oven[i];
        if(i>=1) oven[i] = min(oven[i], oven[i-1]); // 0~i까지의 최소 지름
    }

    int last=D-1;
    while(N-->0) {
        int pizza; cin >> pizza;
        while(last>=0 && pizza>oven[last]) {
            last--;
        }
        if(last<0) {
            cout << 0;
            return 0;
        }
        oven[last]=0;
    }
    cout << last+1;
}
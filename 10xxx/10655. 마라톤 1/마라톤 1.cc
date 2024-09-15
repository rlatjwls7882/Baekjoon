#include<bits/stdc++.h>
using namespace std;

int calcDist(int a[2], int b[2]) {
    return abs(a[0]-b[0])+abs(a[1]-b[1]);
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int pos[N][2], sum=0;
    for(int i=0;i<N;i++) {
        cin >> pos[i][0] >> pos[i][1];
        if(i>0) sum += calcDist(pos[i], pos[i-1]);
    }
    
    int _max=INT_MIN;
    for(int i=1;i<N-1;i++) {
        _max = max(_max, calcDist(pos[i], pos[i-1])+calcDist(pos[i], pos[i+1])-calcDist(pos[i+1], pos[i-1]));
    }
    cout << sum-_max;
}
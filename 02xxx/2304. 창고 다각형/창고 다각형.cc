#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    int height[1001] = {0, };
    while(N-->0) {
        int L, H; cin >> L >> H;
        height[L]=H;
    }

    int sum=0, _max=0;
    for(int i=1;i<=1000;i++) {
        _max = max(_max, height[i]);
        sum += _max;
    }

    int maxFromBack=0;
    for(int i=1000;i>=1 && height[i]!=_max;i--) {
        maxFromBack = max(maxFromBack, height[i]);
        sum -= _max-maxFromBack;
    }
    cout << sum;
}
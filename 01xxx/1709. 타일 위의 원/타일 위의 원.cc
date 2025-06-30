#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    ll r = n/2;
    ll cnt=0;
    for(int i=0;i<r;i++) {
        ll startH = i;
        ll endH = i+1;

        ll startX = sqrt(r*r-startH*startH);
        ll endX = sqrt(r*r-endH*endH);

        cnt += startX - endX;
        if(startX*startX != r*r-startH*startH) cnt++; // ceil(startX)의 실수 오차 때문에 이렇게 구현
    }
    cout << cnt*4;
}
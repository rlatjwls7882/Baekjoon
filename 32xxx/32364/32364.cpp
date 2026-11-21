#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    int H[n];
    for(int i=0;i<n;i++) cin >> H[i];

    int cnt=0;
    for(int i=0;i<n/2;i++) if(H[i]==H[i+n/2]) cnt+=2;
    cout << cnt;
}
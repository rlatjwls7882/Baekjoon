#include<bits/stdc++.h>
using namespace std;
typedef long long ll;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; ll W; cin >> n >> W;

    int s[n];
    for(int i=0;i<n;i++) {
        cin >> s[i];
    }

    for(int i=1;i<n;i++) {
        if(s[i-1]<s[i]) {
            ll cnt = W/s[i-1];
            W += cnt*(s[i]-s[i-1]);
        }
    }
    cout << W;
}
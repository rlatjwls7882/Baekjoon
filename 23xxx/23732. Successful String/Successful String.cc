#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    ll n; string s; cin >> n >> s;

    ll cnt=0, start=0, end=0;
    for(int i=1;i<n;i++) {
        if(s[i]==s[i-1]) start = i-1;
        else if(start==end) start = i;
        end = i;
        if(start!=end) cnt += start+1;
    }
    cout << cnt;
}
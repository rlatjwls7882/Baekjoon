#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; string s; cin >> n >> s;

    int cnt=0;
    for(int i=n-1;i>0;i--) {
        if(!cnt && s[i]=='1' || cnt && s[i]=='0') cnt++;
    }
    cout << cnt;
}
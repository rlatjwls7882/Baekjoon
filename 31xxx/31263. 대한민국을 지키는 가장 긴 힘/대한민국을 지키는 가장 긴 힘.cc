#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; string s; cin >> n >> s;

    int cnt=0;
    for(int i=0;i<n;) {
        if((i+2==n-1 || i+3<n && s[i+3]!='0') && (s[i]-'0')*100+(s[i+1]-'0')*10+s[i+2]-'0'<=641) i+=3;
        else if((i+1==n-1 || i+2<n && s[i+2]!='0')) i+=2;
        else i++;
        cnt++;
    }
    cout << cnt;
}
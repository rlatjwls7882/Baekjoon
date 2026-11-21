#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    for(int tc=1;tc<=t;tc++) {
        int n; string s; cin >> n >> s;

        cout << "Case #" << tc << ':';
        for(int i=0;i<n;i++) {
            int cnt=1;
            for(int j=i-1;j>=0;j--) {
                if(s[j]<s[j+1]) cnt++;
                else break;
            }
            cout << ' ' << cnt;
        }
        cout << '\n';
    }
}
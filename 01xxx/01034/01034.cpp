#include<bits/stdc++.h>
using namespace std;

string s[50];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, m; cin >> n >> m;
    for(int i=0;i<n;i++) cin >> s[i];
    int k; cin >> k;

    int res=0;
    map<string, int> ss;
    for(int i=0;i<n;i++) {
        int cnt=0;
        for(char ch:s[i]) cnt+=ch=='0';
        if(cnt<=k && (k-cnt)%2==0) {
            res = max(res, ++ss[s[i]]);
        }
    }
    cout << res;
}
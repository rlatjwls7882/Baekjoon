#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; string s; cin >> n >> s;
    vector<int> list;
    long long total=1, cur=0;
    for(int i=0;i<n;) {
        if(s.substr(i, 4).compare("long")==0) {
            cur++;
            i+=4;
        } else {
            i++;
            list.push_back(cur);
            cur=0;
        }
    }
    list.push_back(cur);

    long long dp[81];
    dp[0]=1; dp[1]=1;
    for(int i=2;i<=80;i++) dp[i] = dp[i-1]+dp[i-2];

    for(int e:list) total *= dp[e];
    cout << total;
}
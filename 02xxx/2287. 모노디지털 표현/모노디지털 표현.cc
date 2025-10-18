#include<bits/stdc++.h>
using namespace std;

int k, t;
vector<set<int>> dp(9); // dp[i] : k를 i번 사용하여 만들 수 있는 수들

string chk(int n) {
    for(int i=1;i<=8;i++) {
        if(dp[i].count(n)) return to_string(i);
    }
    return "NO";
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> k >> t;

    int last=0;
    for(int i=1;i<=8;i++) {
        last = last*10+k;
        dp[i].insert(last);
    }
    for(int i=1;i<8;i++) {
        for(int j=1;j<=i;j++) {
            if(i+j>8) continue;
            for(int a : dp[i]) {
                for(int b : dp[j]) {
                    dp[i+j].insert(a+b);
                    dp[i+j].insert(a-b);
                    dp[i+j].insert(b-a);
                    dp[i+j].insert(a*b);
                    if(b!=0) dp[i+j].insert(a/b);
                    if(a!=0) dp[i+j].insert(b/a);
                }
            }
        }
    }

    while(t--) {
        int n; cin >> n;
        cout << chk(n) << '\n';
    }
}
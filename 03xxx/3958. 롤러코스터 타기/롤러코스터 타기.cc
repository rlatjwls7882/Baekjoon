#include<bits/stdc++.h>
using namespace std;

const int MAX = 25'000;

int dp[MAX+1]; // i초까지의 최대 재미
vector<pair<int, int>> ride; // [t, f] : t초, f재미를 가진 롤러코스터 탑승들

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    while(n--) {
        int a, b, t; cin >> a >> b >> t;
        if(b==0) { // b=0인 경우 예외 처리
            for(int i=0;i+t<=MAX;i++) dp[i+t] = max(dp[i+t], dp[i]+a);
        } else {
            int curT=t, k=1, curFun=a;
            while(curT<=MAX && curFun>0) {
                ride.push_back({t, curFun});
                curT += t;
                k++;
                curFun = a-(k-1)*(k-1)*b;
            }
        }
    }

    for(auto [t, f]:ride) {
        for(int i=MAX;i-t>=0;i--) {
            dp[i] = max(dp[i], dp[i-t]+f);
        }
    }

    int q; cin >> q;
    while(q--) {
        int t; cin >> t;
        cout << dp[t] << '\n';
    }
}
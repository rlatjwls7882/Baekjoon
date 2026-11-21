#include<bits/stdc++.h>
using namespace std;

long long calc(long long a, long long b, long long c) {
    return a*a+b*b+c*c+7*min(min(a, b), c);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    while(n-->0) {
        long long a, b, c, d; cin >> a >> b >> c >> d;

        long long maxScore = max(max(calc(a+d, b, c), calc(a, b+d, c)), calc(a, b, c+d));
        for(long long da=0;da<500;da++) {
            for(long long db=0;db<500;db++) {
                for(long long dc=0;dc<500;dc++) {
                    if(da+db+dc<=d) maxScore = max(maxScore, calc(a+da, b+db, c+dc));
                }
            }
        }
        cout << maxScore << '\n';
    }
}
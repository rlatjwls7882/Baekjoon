#include<bits/stdc++.h>
using namespace std;

typedef unsigned long long ull;
ull p, n1, n2, n3, n4;

bool solve(ull n) {
    ull mod = 1;
    while(mod<=n/p) mod *= p;
    if(mod == n) return false; // 제곱수인 경우 불가능

    int total=0; // 총 항의 수
    int cnt=0; // 계수가 1인 항의 수
    while(mod>=1) {
        if(n/mod>2) return false; // 계수가 3 이상인 경우 불가능
        if(n/mod==1) cnt++;
        if(n/mod>=1) total++;
        n %= mod;
        mod /= p;
    }
    return !(total>=3 && cnt>=2); // 항이 3개 이상이고, 그중 두개 이상의 항의 계수가 1이면 불가능
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> p >> n1 >> n2 >> n3 >> n4;
    cout << solve(n1) << ' ' << solve(n2) << ' ' << solve(n3) << ' ' << solve(n4);
}
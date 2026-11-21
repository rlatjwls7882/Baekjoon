#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    long long a, b; cin >> a >> b;
    long long cnt=0, total=b-a;
    // 약수가 홀수인 수 = 제곱수
    for(long long i=1;i*i<=b;i++) {
        if(i*i>a) cnt++;
    }

    long long gcdVal = gcd(cnt, total);
    if(cnt) cout << cnt/gcdVal << '/' << total/gcdVal;
    else cout << 0;
}
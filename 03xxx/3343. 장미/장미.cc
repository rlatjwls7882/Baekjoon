#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    ll n, a, b, c, d; cin >> n >> a >> b >> c >> d;

    // ac * k번의 공통 연산을 빼면 나머지 연산은 항상 ac번보다 작음
    ll minPrice=LLONG_MAX;
    for(ll extraA=0;extraA<=c && extraA*a<=n;extraA++) { // a를 extraA번
        minPrice = min(minPrice, extraA*b + (n-extraA*a+c-1)/c*d);
    }
    for(ll extraC=0;extraC<=a && extraC*c<=n;extraC++) { // c를 extraC번
        minPrice = min(minPrice, (n-extraC*c+a-1)/a*b + extraC*d);
    }
    cout << minPrice;
}
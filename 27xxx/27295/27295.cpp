#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);

    long long n, b; cin >> n >> b;
    long long xSum=0, ySum=0;
    for(int i=0;i<n;i++) {
        long long x, y; cin >> x >> y;
        xSum += x;
        ySum += y;
    }

    if(xSum==0) {
        cout << "EZPZ";
    } else {
        long long numerator = ySum-b*n;
        long long denominator = xSum;
        if(denominator<0) {
            denominator *= -1;
            numerator *= -1;
        }

        if(abs(ySum-b*n)%abs(xSum)==0) {
            cout << (ySum-b*n)/xSum;
        } else {
            int gcdVal = gcd(abs(ySum-b*n), abs(xSum));
            cout << numerator/gcdVal << '/' << denominator/gcdVal;
        }
    }

}
#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    // 두 사각형의 무게중심
    long long x1=0, y1=0;
    for(int i=0;i<4;i++) {
        int tmpx, tmpy; cin >> tmpx >> tmpy;
        x1 += tmpx;
        y1 += tmpy;
    }

    long long x2=0, y2=0;
    for(int i=0;i<4;i++) {
        int tmpx, tmpy; cin >> tmpx >> tmpy;
        x2 += tmpx;
        y2 += tmpy;
    }

    // 두 점을 지나는 직선
    long long a1 = y1 - y2;
    long long a2 = x1 - x2;
    if(a2<0) {
        a1 *= -1;
        a2 *= -1;
    }

    long long gcdVal = gcd(a1, a2);
    a1 /= gcdVal;
    a2 /= gcdVal;

    long long b1 = a2*y1 - a1*x1;
    long long b2 = a2*4;
    if(b2<0) {
        b1 *= -1;
        b2 *= -1;
    }

    gcdVal = gcd(b1, b2);
    b1 /= gcdVal;
    b2 /= gcdVal;

    cout << a1;
    if(a2!=1) {
        cout << "/" << a2;
    }

    cout << ' ' << b1;
    if(b2!=1) {
        cout << "/" << b2;
    }
}
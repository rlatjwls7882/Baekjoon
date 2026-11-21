#include<bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int arr[N];
    for(int i=0;i<N;i++) {
        cin >> arr[i];
    }

    int numerator=1, denominator=1;
    for(int i=1;i<N;i++) {
        numerator*=arr[i-1];
        denominator*=arr[i];
        int _gcd = gcd(numerator, denominator);
        numerator/=_gcd;
        denominator/=_gcd;
        cout << numerator << '/' << denominator << '\n';
    }
}
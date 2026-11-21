#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, t; cin >> n >> t;

    int sum=0;
    while(n--) {
        int a; cin >> a;

        int low = a, high = a;
        while(t%low) low--;
        while(t%high && high<2000) high++; // a가 t보다 큰 경우 high를 2000으로 예외처리

        sum += min(a-low, high-a);
    }
    cout << sum;
}
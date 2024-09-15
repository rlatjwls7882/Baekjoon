#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    long long sum=0;
    for(long long i=1;i<=N;i++) {
        sum += i*(N/i);
    }
    cout << sum;
}
#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    
    long long sum=1;
    for(long long i=1;i<=N-1;i+=2) {
        sum = sum*i%1000000007;
    }
    cout << sum;
}
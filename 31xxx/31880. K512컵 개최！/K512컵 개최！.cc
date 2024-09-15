#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    long long sum=0;
    while(N-->0) {
        long long tmp; cin >> tmp;
        sum += tmp;
    }
    while(M-->0) {
        long long tmp; cin >> tmp;
        if(tmp!=0) sum *= tmp;
    }
    cout << sum;
}
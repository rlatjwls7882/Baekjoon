#include<bits/stdc++.h>
using namespace std;

long long calc(long long n, long long &k, long long prime) {
    // 현재의 소인수가 k에서 등장한 횟수
    long long kCnt=0;
    while(k%prime==0) {
        kCnt++;
        k/=prime;
    }

    // 현재의 소인수가 n에서 등장한 횟수
    long long nCnt=0;
    for(long long i=1;n/i>=prime;) {
        i*=prime;
        nCnt += n/i;
    }
    return nCnt/kCnt;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t; cin >> t;
    while(t-->0) {
        long long n, k; cin >> n >> k;

        // maxI: 소인수의 최대 겹침 횟수
        long long maxI = LONG_LONG_MAX;
        for(long long i=2;i*i<=k;i++) {
            if(k%i==0) {
                maxI = min(calc(n, k, i), maxI);
            }
        }
        if(k>1) maxI = min(calc(n, k, k), maxI);
        cout << maxI << '\n';
    }
}
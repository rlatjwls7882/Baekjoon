#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    long long N, K; cin >> N >> K;
    for(int len=1;;len++) {
        long long cnt = pow(10, len-1)*9*len;
        if(K<=cnt) {
            int cur = pow(10, len-1)+(K-1)/len;
            if(cur>N) {
                cout << -1;
            } else {
                cout << to_string(cur)[(K-1)%len];
            }
            return 0;
        } else {
            K -= cnt;
        }
    }
}
#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, K; long long last; cin >> N >> K >> last;
    
    long long cnt=0;
    for(int i=1;i<N;i++) {
        long long cur; cin >> cur;
        if(cur-last<=K) {
            cnt += last+K-cur;
            last += K;
        } else {
            cnt += (cur-last-K)*i;
            last=cur;
        }
    }
    cout << cnt;
}
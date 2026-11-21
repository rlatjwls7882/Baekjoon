#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    long long N, K; cin >> N >> K;
    vector<int> course(N);
    for(int i=0;i<N;i++) cin >> course[i];

    for(int i=0;i<N;i++) {
        K-=course[i];
        if(K<0) {
            cout << i+1;
            return 0;
        }
    }
    for(int i=N-1;i>=0;i--) {
        K-=course[i];
        if(K<0) {
            cout << i+1;
            return 0;
        }
    }
    cout << 1;
}
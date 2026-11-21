#include<bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, X; cin >> N >> X;
    
    int pSum[N+1] = {0, };
    for(int i=1;i<=N;i++) {
        cin >> pSum[i];
        pSum[i] += pSum[i-1];
    }

    int max=0, cnt=0;
    for(int i=X;i<=N;i++) {
        int cur = pSum[i]-pSum[i-X];
        if(cur>max) {
            max=cur;
            cnt=1;
        } else if(cur==max) {
            cnt++;
        }
    }

    if(max==0) cout << "SAD";
    else cout << max << '\n' << cnt;
}
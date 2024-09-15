#include<bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, K; cin >> N >> K;

    int cnt=0;
    bool chk[N+1] = {false, };
    for(int i=2;i<=N;i++) {
        if(!chk[i]) {
            for(int j=i;j<=N;j+=i) {
                if(!chk[j]) {
                    chk[j]=true;
                    if(++cnt==K) {
                        cout << j;
                        return 0;
                    }
                }
            }
        }
    }
}
#include<bits/stdc++.h>
using namespace std;

bool used[21];
long long fact[21];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    fact[0]=1;
    for(int i=1;i<=20;i++) fact[i] = fact[i-1]*i;

    int N, x; cin >> N >> x;
    if(x==1) {
        long long k; cin >> k;
        for(int i=N-1;i>=0;i--) {
            for(int j=1;j<=N;j++) {
                if(!used[j] && k<=fact[i]) {
                    used[j]=true;
                    cout << j << ' ';
                    break;
                } else if(!used[j]) {
                    k -= fact[i];
                }
            }
        }
    } else {
        long long k=1;
        for(int i=N-1;i>=0;i--) {
            int cur; cin >> cur;
            int cnt=0;
            for(int j=1;j<cur;j++) {
                if(!used[j]) cnt++;
            }
            k += cnt*fact[i];
            used[cur]=true;
        }
        cout << k;
    }
}
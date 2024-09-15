#include<bits/stdc++.h>
using namespace std;

long long cnt[1000001] = {0, };

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    for(int i=1;i<=1000000;i++) {
        for(int j=i;j<=1000000;j+=i) {
            cnt[j]+=i;
        }
    }
    for(int i=1;i<1000000;i++) {
        cnt[i+1] += cnt[i];
    }

    int T; cin >> T;
    while(T-->0) {
        int N; cin >> N;
        cout << cnt[N] << '\n';
    }
}
#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int sum[N];
    for(int i=0;i<N;i++) cin >> sum[i];

    int cnt[N] = {0, };
    for(int i=0;i<N;i++) {
        if(i%2==0) cnt[0] += sum[i];
        else cnt[0] -= sum[i];
    }
    cnt[0]/=2;

    for(int i=0;i<N;i++) {
        if(i) cnt[i] = sum[i-1]-cnt[i-1];
        cout << cnt[i] << '\n';
    }
}
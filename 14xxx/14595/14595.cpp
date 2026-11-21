#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;

    int sweep[N+1] = {0, };
    while(M-->0) {
        int a, b; cin >> a >> b;
        sweep[a-1]++;
        sweep[b-1]--;
    }

    int cnt=0;
    for(int i=0;i<N;i++) {
        if(i+1<N) sweep[i+1] += sweep[i];
        if(!sweep[i]) cnt++;
    }
    cout << cnt;
}
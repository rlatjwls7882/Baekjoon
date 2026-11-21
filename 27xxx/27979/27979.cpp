#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int w[N], sortedW[N];
    for(int i=0;i<N;i++) {
        cin >> w[i];
        sortedW[i]=w[i];
    }
    sort(sortedW, sortedW+N, greater<int>());

    int idx;
    for(int i=N-1;i>=0;i--) {
        if(sortedW[0]==w[i]) {
            idx=i;
            break;
        }
    }

    int cnt=0;
    for(int i=idx;i>=0;i--) {
        if(w[i]==sortedW[cnt]) {
            cnt++;
        }
    }
    cout << N-cnt;
}
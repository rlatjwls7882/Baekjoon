#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int rank[N];
    for(int i=0;i<N;i++) {
        cin >> rank[i];
    }
    sort(rank, rank+N);
    
    long long cnt=0;
    for(int i=0;i<N;i++) {
        cnt += abs(rank[i]-(i+1));
    }
    cout << cnt;
}
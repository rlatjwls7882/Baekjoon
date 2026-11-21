#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N, M; cin >> N >> M;
    for(int i=0;i<N;i++) {
        int s, e; cin >> s >> e;
    }

    double sum=0;
    while(M-->0) {
        int t, p; cin >> t >> p;
        sum += p;
    }
    cout << sum/N;
}
#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N; cin >> N;

    int cnt=0;
    for(int i=1;i<=N;i++) {
        for(int j=i;i+j<=N;j++) {
            int k = N-i-j;
            if(j<=k && i+j>k) cnt++;
        }
    }
    cout << cnt;
}
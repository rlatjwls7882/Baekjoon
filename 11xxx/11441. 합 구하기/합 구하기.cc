#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int arr[N+1] = {0, };
    for(int i=1;i<=N;i++) {
        cin >> arr[i]; arr[i] += arr[i-1];
    }

    int M; cin >> M;
    while(M-->0) {
        int i, j; cin >> i >> j;
        cout << arr[j]-arr[i-1] << '\n';
    }
}
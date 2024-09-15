#include<bits/stdc++.h>
using namespace std;

const long long MOD = 1000000007;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    long long arr[191229];
    arr[0]=1;
    arr[1]=2;
    for(int i=2;i<191229;i++) {
        arr[i] = (arr[i-1]+arr[i-2])%MOD;
    }

    int T; cin >> T;
    while(T-->0) {
        int N; cin >> N;
        cout << arr[N-1] << '\n';
    }
}
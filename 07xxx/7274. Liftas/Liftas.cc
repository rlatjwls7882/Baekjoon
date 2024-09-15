#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    int N, K; cin >> N >> K;

    int sum=0;
    int a[N];
    for(int i=0;i<N;i++) {
        cin >> a[i];
        sum += a[i];
    }
    sort(a, a+N, greater<int>());

    for(int i=0;i<K;i++) {
        sum -= a[i];
    }
    cout << sum;
}
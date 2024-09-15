#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int a[N];
    for(int i=0;i<N;i++) {
        cin >> a[i];
    }
    sort(a, a+N);

    int sum=a[N-1];
    for(int i=0;i<N/2;i++) {
        sum += a[N-2-i] - a[i];
    }
    cout << sum;
}
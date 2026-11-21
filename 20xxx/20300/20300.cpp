#include<bits/stdc++.h>
using namespace std;
typedef long long ll;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    ll t[N];
    for(int i=0;i<N;i++) {
        cin >> t[i];
    }
    sort(t, t+N);

    ll _max = 0;
    if(N%2==1) {
        _max = max(_max, t[N-1]);
        N--;
    }

    for(int i=0;i<N/2;i++) {
        _max = max(_max, t[i]+t[N-1-i]);
    }
    cout << _max;
}
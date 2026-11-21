#include<bits/stdc++.h>
using namespace std;
typedef long long ll;

ll MOD = 1000000007;

ll sqr(ll a, ll k) {
    if(k==0) return 1;
    if(k==1) return a;

    ll tmp = sqr(a, k/2);
    if(k%2==0) return tmp*tmp%MOD;
    else return (tmp*tmp%MOD)*a%MOD;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    ll arr[N];
    for(int i=0;i<N;i++) {
        cin >> arr[i];
    }
    sort(arr, arr+N);

    ll sum=0, total=0;
    for(int i=0;i<N/2;i++) {
        sum = (sum - arr[i] + arr[N-1-i])%MOD;
        if(i!=N-2-i) total += sum*((sqr(2, i)+sqr(2, N-2-i))%MOD)%MOD;
        else total += sum*sqr(2, i)%MOD;
        total %= MOD;
    }
    cout << total;
}
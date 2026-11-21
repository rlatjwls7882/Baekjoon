#include<bits/stdc++.h>
using namespace std;
typedef long long ll;

ll P, Q;
map<ll, ll> A = {{0, 1}};

ll findVal(ll N) {
    ll sum=0;

    if(!A.count(N/P)) A[N/P] = findVal(N/P);
    sum += A[N/P];

    if(!A.count(N/Q)) A[N/Q] = findVal(N/Q);
    sum += A[N/Q];

    return sum;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    ll N; cin >> N >> P >> Q;

    // A[N] = A[N/P](=A[N/P/P] + A[N/P/Q]) + A[N/Q](=A[N/Q/P] + A[N/Q/Q])
    if(N==0) cout << 1;
    else cout << findVal(N);
}
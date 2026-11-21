#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

ll pow(ll a, int b) {
    ll sum=1;
    while(b-->0) {
        sum*=a;
    }
    return sum;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    ll N; cin >> N;
    bitset<64> s = bitset<64>(N);

    ll sum=0;
    for(int i=0;i<64;i++) {
        if(s[i]) {
            sum += pow((ll)3, i);
        }
    }
    cout << sum;
}
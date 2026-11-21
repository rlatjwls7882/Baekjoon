#include<bits/stdc++.h>
using namespace std;
typedef long long ll;

ll pow(ll a, int b) {
    ll sum=1;
    while(b-->0) {
        sum*=a;
    }
    return sum;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    ll N; cin >> N;
    bitset<64> bin = bitset<64>(N);

    int size=64;
    for(int i=63;i>=0;i--) {
        if(!bin[i]) size=i;
        else break;
    }
    ll cnt=pow((ll)2, size)-1;

    if(cnt!=N) {
        cout << "2\n" << (N^cnt) << '\n' << N;
    } else {
        cout << "1" << '\n' << N;
    }
}
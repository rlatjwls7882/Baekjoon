#include<bits/stdc++.h>
using namespace std;
typedef long long ll;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int T; cin >> T;

    while(T-->0) {
        ll N; cin >> N;
        bitset<64> bin = bitset<64>(N);
        
        ll sum=0;
        for(int i=63;i>=0;i--) {
            sum*=3;
            if(bin[i]) {
                sum+=1;
            }
        }
        cout << sum << '\n';
    }
}
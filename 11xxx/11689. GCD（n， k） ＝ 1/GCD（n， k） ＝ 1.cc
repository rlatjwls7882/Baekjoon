#include<bits/stdc++.h>
using namespace std;
typedef long long ll;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    bool notSosu[1000000] = {true, true, false, };
    for(int i=2;i*i<1000000;i++) {
        if(!notSosu[i]) {
            for(int j=i*i;j<1000000;j+=i) {
                notSosu[j]=true;
            }
        }
    }

    ll n; cin >> n;
    ll total=1;
    for(ll i=2;i<1000000;i++) {
        if(!notSosu[i] && n%i==0) {
            ll cnt=0;
            while(n%i==0) {
                cnt++;
                n/=i;
            }

            if(cnt==1) total *= i-1;
            else if(cnt>=2) total *= (i-1)*powl(i, cnt-1);
        }
    }

    if(n!=1) {
        total *= n-1;
    }
    cout << total;
}
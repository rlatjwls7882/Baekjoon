#include<bits/stdc++.h>
using namespace std;

const int MAX = 1'000'001;

bool notPrime[MAX];
vector<int> primes;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    for(int i=2;i*i<MAX;i++) {
        if(!notPrime[i]) {
            for(int j=i*i;j<MAX;j+=i) {
                notPrime[j]=true;
            }
        }
    }
    for(int i=2;i<MAX;i++) {
        if(!notPrime[i]) {
            primes.push_back(i);
        }
    }

    int n; cin >> n;
    while(n--) {
        int a, b; cin >> a >> b;
        int lo = lower_bound(primes.begin(), primes.end(), a) - primes.begin();
        int hi = prev(upper_bound(primes.begin(), primes.end(), b), 1) - primes.begin();
        if((hi+lo+1)%2==0) cout << "-1\n";
        else cout << primes[(hi+lo)/2] << '\n';
    }
}
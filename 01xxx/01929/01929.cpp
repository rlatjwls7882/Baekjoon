#include<bits/stdc++.h>
using namespace std;

const int MAX = 1'000'001;

bool notPrime[MAX] = {1, 1};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    for(int i=2;i*i<MAX;i++) {
        if(!notPrime[i]) {
            for(int j=i*i;j<MAX;j+=i) notPrime[j]=true;
        }
    }

    int m, n; cin >> m >> n;
    for(int i=m;i<=n;i++) {
        if(!notPrime[i]) cout << i << '\n';
    }
}
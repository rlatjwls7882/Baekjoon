#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);

    bool notPrime[100000] = {false, };
    for(int i=2;i*i<100000;i++) {
        if(!notPrime[i]) {
            for(int j=i*i;j<100000;j+=i) {
                notPrime[j]=true;
            }
        }
    }
    vector<int> prime;
    for(int i=2;i<100000;i++) {
        if(!notPrime[i]) {
            prime.push_back(i);
        }
    }

    int N; cin >> N;
    while(N-->0) {
        int tmp; cin >> tmp;

        int cnt=0;
        for(int i=0;prime[i]<=tmp;i++) {
            while(tmp>1 && tmp%prime[i]==0) {
                tmp/=prime[i];
                cnt++;
            }
            if(cnt>0) cout << prime[i] << " " << cnt << '\n';
            cnt=0;
        }
    }
}
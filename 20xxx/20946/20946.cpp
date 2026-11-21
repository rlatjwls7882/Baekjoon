#include<bits/stdc++.h>
using namespace std;

vector<long long> sosu;
int notSosu[1000001] = {false, };

bool isNotPrime(long long N) {
    if(N<=1000000) {
        if(notSosu[N]) return true;
        else return false;
    }
    for(int i=0;i<sosu.size() && sosu[i]*sosu[i]<=N;i++) {
        if(N%sosu[i]==0) return true;
    }
    return false;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    for(int i=2;i*i<=1000000;i++) {
        if(!notSosu[i]) {
            for(int j=i*i;j<=1000000;j+=i) {
                notSosu[j]=true;
            }
        }
    }

    for(int i=2;i<=1000000;i++) {
        if(!notSosu[i]) {
            sosu.push_back(i);
        }
    }

    long long N; cin >> N;
    if(!isNotPrime(N)) {
        cout << -1;
        return 0;
    }

    vector<long long> res;
    for(long long i=4;i*i<=N;i++) {
        if(N%i==0 && isNotPrime(i)) {
            while(N%i==0) {
                res.push_back(i);
                N/=i;
            }
            if(!isNotPrime(N)) break;
        }
    }

    if(res.empty()) {
        cout << N;
    } else if(isNotPrime(N)) {
        for(long long val:res) {
            cout << val << ' ';
        }
        cout << N;
    } else {
        for(int i=0;i<res.size()-1;i++) {
            cout << res[i] << ' ';
        }
        cout << res[res.size()-1]*N;
    }
}
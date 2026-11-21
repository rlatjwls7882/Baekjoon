#include <bits/stdc++.h>
using namespace std;

vector<long long> sosuList;

bool isPrime(long long N) {
    for(long long sosu:sosuList) {
        if(N%sosu==0) return false;
    }
    return true;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    bool notSosu[2000000] = {false, };
    for(int i=2;i*i<2000000;i++) {
        if(!notSosu[i]) {
            for(int j=i*i;j<2000000;j+=i) {
                notSosu[j]=true;
            }
        }
    }

    for(int i=2;i<2000000;i++) {
        if(!notSosu[i]) {
            sosuList.push_back(i);
        }
    }

    int T; cin >> T;
    while(T-->0) {
        long long a, b; cin >> a >> b;
        long long N = a+b;

        if(N<=3) {
            cout << "NO\n";
        } else if(N%2==0) {
            cout << "YES\n";
        } else if(N-2<2000000) {
            if(!notSosu[N-2]) cout << "YES\n";
            else cout << "NO\n";
        } else {
            if(isPrime(N-2)) cout << "YES\n";
            else cout << "NO\n";
        }
    }
}
#include<bits/stdc++.h>
#define MOD 4294967296
#define MAX 100000000
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    vector<bool> notSosu = vector<bool>(MAX+1);
    for(int i=2;i*i<=MAX;i++) {
        if(!notSosu[i]) {
            for(int j=i*i;j<=MAX;j+=i) {
                notSosu[j]=true;
            }
        }
    }

    vector<int> sosu;
    for(int i=2;i<=MAX;i++) {
        if(!notSosu[i]) {
            sosu.push_back(i);
        }
    }

    int n; cin >> n;
    long long sum=1;
    for(int i=0;sosu[i]<=n;i++) {
        long long tmp=sosu[i];
        while(tmp*sosu[i]<=n) {
            tmp*=sosu[i];
        }
        sum = sum*tmp%MOD;
    }
    cout << sum;
}
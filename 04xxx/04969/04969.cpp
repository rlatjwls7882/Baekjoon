#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    bool notSosu[300000] = {false, };
    notSosu[1]=true;
    for(long long i=0;i*7<300000;i++) {
        if(i*7+1<300000 && !notSosu[i*7+1]) {
            for(long long j=(i*7+1)*(i*7+1);j<300000;j+=i*7+1) {
                notSosu[j]=true;
            }
        }
        if(i*7+6<300000 && !notSosu[i*7+6]) {
            for(long long j=(i*7+6)*(i*7+6);j<300000;j+=i*7+6) {
                notSosu[j]=true;
            }
        }
    }

    while(true) {
        int n; cin >> n;
        if(n==1) break;
        cout << n << ':';
        for(int i=0;i*7<n;i++) {
            if(i*7+1<=n && n%(i*7+1)==0 && !notSosu[i*7+1]) {
                cout << ' ' << i*7+1;
            }
            if(i*7+6<=n && n%(i*7+6)==0 && !notSosu[i*7+6]) {
                cout << ' ' << i*7+6;
            }
        }
        cout << '\n';
    }
}
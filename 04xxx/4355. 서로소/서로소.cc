#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    bool notSosu[100000] = {true, true, false, };
    for(int i=2;i*i<100000;i++) {
        if(!notSosu[i]) {
            for(int j=i*i;j<100000;j+=i) {
                notSosu[j]=true;
            }
        }
    }

    while(true) {
        int n; cin >> n;
        if(n==0) break;

        if(n==1) {
            cout << "0\n";
        } else {
            int total=1;
            for(int i=2;i<100000 && n!=1;i++) {
                if(!notSosu[i] && n%i==0) {
                    int cnt=0;
                    while(n%i==0) {
                        cnt++;
                        n/=i;
                    }
                    total *= (i-1)*pow(i, cnt-1);
                }
            }
            if(n!=1) total *= n-1;
            cout << total << '\n';
        }
    }
}
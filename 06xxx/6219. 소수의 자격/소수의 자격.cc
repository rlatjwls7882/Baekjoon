#include<bits/stdc++.h>
using namespace std;

bool contain(int A, int D) {
    while(A!=0) {
        if(A%10==D) return true;
        A/=10;
    }
    return false;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int A, B, D; cin >> A >> B >> D;

    int notPrime[B+4] = {true, true, false, };
    for(int i=2;i*i<=B;i++) {
        if(!notPrime[i]) {
            for(int j=i*i;j<=B;j+=i) {
                notPrime[j]=true;
            }
        }
    }

    int cnt=0;
    for(int i=A;i<=B;i++) {
        if(!notPrime[i] && contain(i, D)) {
            cnt++;
        }
    }
    cout << cnt;
}
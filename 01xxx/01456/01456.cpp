#include<bits/stdc++.h>
using namespace std;

const int len=10000000;
bool notSosu[len] = {true, true, false, };

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    for(int i=2;i*i<len;i++) {
        if(!notSosu[i]) {
            for(int j=i*i;j<len;j+=i) {
                notSosu[j]=true;
            }
        }
    }

    int cnt=0;
    long long A, B; cin >> A >> B;
    for(long long i=2;i*i<=B;i++) {
        if(!notSosu[i]) {
            for(long long j=i*i;j<=B;j*=i) {
                if(j>=A) cnt++;
                if((int)(log10(j)+1)+(int)(log10(i)+1)>18) break;
            }
        }
    }
    cout << cnt;
}
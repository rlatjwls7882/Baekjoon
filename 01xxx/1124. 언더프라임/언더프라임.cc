#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    bool notSosu[50000] = {true, true, false, };
    for(int i=2;i*i<50000;i++) {
        if(!notSosu[i]) {
            for(int j=i*i;j<50000;j+=i) {
                notSosu[j]=true;
            }
        }
    }

    int len[100001] = {0, 0, 1, 1, };
    for(int i=4;i<=100000;i++) {
        for(int j=2;;j++) {
            if(i%j==0) {
                len[i] = len[i/j]+1;
                break;
            }
        }
    }

    int A, B; cin >> A >> B;
    int cnt=0;
    for(int i=A;i<=B;i++) {
        if(!notSosu[len[i]]) {
            cnt++;
        }
    }
    cout << cnt;
}
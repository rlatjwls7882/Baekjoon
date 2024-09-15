#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, K; cin >> N >> K;

    int cnt=1;
    for(int num=2;num<=N;num++) {
        int tmp=num;
        bool chk=true;
        for(int i=2;tmp>1;i++) {
            if(i>K) {
                chk=false;
                break;
            }
            while(tmp%i==0) {
                tmp/=i;
            }
        }
        if(chk) cnt++;
    }
    cout << cnt;
}
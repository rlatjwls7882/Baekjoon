#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    string s; cin >> s;
    int N = s.size();

    bool chk[N+1] = {false, };
    for(int i=1;i<=N;i++) {
        if(s[i-1]=='Y') {
            chk[i]=true;
        }
    }

    int cnt=0;
    for(int i=1;i<=N;i++) {
        if(chk[i]) {
            cnt++;
            for(int j=i*2;j<=N;j+=i) {
                chk[j] = !chk[j];
            }
        }
    }
    cout << cnt;
}
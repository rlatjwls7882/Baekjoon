#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, Q; cin >> N >> Q;
    
    bool chk[N+1] = {false, };
    int cnt=N;
    while(Q-->0) {
        int a; cin >> a;
        if(a==3) {
            cout << cnt << '\n';
        } else {
            int x; cin >> x;
            if(a==1 && !chk[x]) {
                chk[x]=true;
                cnt--;
            } else if(a==2 && chk[x]) {
                chk[x]=false;
                cnt++;
            }
        }
    }
}
#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int T; cin >> T;
    while(T-->0) {
        int N; cin >> N;
        int A[N];
        for(int i=0;i<N;i++) {
            cin >> A[i];
        }

        string res = "YES\n";
        int chk[N+1] = {0, };
        int cur=0, cnt=0;
        for(int i=0;i<N;i++) {
            if(A[i]==cur+1) {
                cur++;
                while(chk[cur+1]) {
                    if(chk[cur+1]==2) cnt--;
                    cur++;
                }
            } else {
                if(!chk[A[i]-1]) {
                    cnt++;
                    chk[A[i]]=2;
                } else {
                    chk[A[i]]=1;
                }
                if(cnt>2) {
                    res = "NO\n";
                    break;
                }
            }
        }
        cout << res;
    }
}
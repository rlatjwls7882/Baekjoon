#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    string S[N]; int idx;
    for(int i=0;i<N;i++) {
        cin >> S[i];
        if(S[i].compare("?")==0) {
            idx=i;
        }
    }

    int M; cin >> M;
    while(M-->0) {
        string A; cin >> A;

        bool chk=false;
        for(int i=0;i<N;i++) {
            if(A.compare(S[i])==0) {
                chk=true;
                break;
            }
        }
        if(chk) continue;
        
        if(idx==0) {
            if(N==1 || A[A.length()-1]==S[idx+1][0]) {
                cout << A;
                return 0;
            }
        } else if(idx==N-1) {
            if(A[0]==S[idx-1][S[idx-1].length()-1]) {
                cout << A;
                return 0;
            }
        } else {
            if(A[A.length()-1]==S[idx+1][0] && A[0]==S[idx-1][S[idx-1].length()-1]) {
                cout << A;
                return 0;
            }
        }
    }
}
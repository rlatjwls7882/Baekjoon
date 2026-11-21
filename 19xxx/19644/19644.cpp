#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int L; cin >> L;
    int ML, MK; cin >> ML >> MK;
    int C; cin >> C;

    int shootCnt=0;
    bool chk[L] = {false, };
    for(int i=0;i<L;i++) {
        int Z; cin >> Z;
        if(i>=ML && chk[i-ML]) shootCnt--;

        if(Z<=MK*(shootCnt+1)) {
            shootCnt++;
            chk[i]=true;
        } else {
            if(C==0) {
                cout << "NO";
                return 0;
            }
            C--;
        }
    }
    cout << "YES";
}
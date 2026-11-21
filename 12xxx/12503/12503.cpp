#include<bits/stdc++.h>
using namespace std;

int N, pD, pG;

void chk() {
    for(int D=1;D<=N;D++) {
        if(D*pD%100==0) {
            int todayWin = D*pD/100;
            int todayLose = D-todayWin;
            for(int G=D;G<=10000;G++) {
                if(G*pG%100==0 && G*pG/100>=todayWin && G-G*pG/100>=todayLose) {
                    cout << "Possible\n";
                    return;
                }
            }
        }
    }
    cout << "Broken\n";
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    for(int tc=1;tc<=t;tc++) {
        cin >> N >> pD >> pG;

        cout << "Case #" << tc << ": ";
        chk();
    }
}
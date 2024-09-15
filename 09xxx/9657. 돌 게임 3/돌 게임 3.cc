#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(); cin.tie(); cout.tie();
    int N; cin >> N;

    int winner[N+4] = {0, 1, 2, 1, 1};
    for(int i=5;i<=N;i++) {
        bool chk=false;
        if(winner[i-1]==2) {
            chk=true;
        }
        if(winner[i-3]==2) {
            chk=true;
        }
        if(winner[i-4]==2) {
            chk=true;
        }

        if(chk) {
            winner[i]=1;
        } else {
            winner[i]=2;
        }
    }

    if(winner[N]==1) {
        cout << "SK";
    } else {
        cout << "CY";
    }
}
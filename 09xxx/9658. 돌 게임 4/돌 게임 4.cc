#include <bits/stdc++.h>

using namespace std;

int SK=1, CY=2;

int main(void) {
    ios::sync_with_stdio(); cin.tie(); cout.tie();
    int N; cin >> N;

    int winner[N+4] = {0, CY, SK, CY, SK};
    for(int i=5;i<=N;i++) {
        bool chk=false;
        if(winner[i-1]==CY) {
            chk=true;
        }
        if(winner[i-3]==CY) {
            chk=true;
        }
        if(winner[i-4]==CY) {
            chk=true;
        }

        if(chk) {
            winner[i]=SK;
        } else {
            winner[i]=CY;
        }
    }

    if(winner[N]==SK) {
        cout << "SK";
    } else {
        cout << "CY";
    }
}
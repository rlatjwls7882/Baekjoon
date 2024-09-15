#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(); cin.tie(); cout.tie();
    long long N; cin >> N;
    
    int winner[5] = {1, 2, 1, 1, 2};
    if(winner[(N-1)%5]==1) {
        cout << "SK";
    } else {
        cout << "CY";
    }

    // int SK=1, CY=2;
    // int winner[N+1] = {CY, SK};
    // for(int i=2;i<=N;i++) {
    //     bool chk=false;
    //     for(int j=0;;j++) {
    //         long long _pow = pow(4, j);
    //         if(_pow>i) {
    //             break;
    //         }
    //         if(winner[i-_pow]==CY) {
    //             chk=true;
    //             break;
    //         }
    //     }

    //     if(chk) {
    //         winner[i]=SK;
    //     } else {
    //         winner[i]=CY;
    //     }
    // }
    // for(int i=1;i<=N;i++) {
    //     cout << winner[i] << " ";
    //     if(i%5==0) cout << endl;
    // }
}
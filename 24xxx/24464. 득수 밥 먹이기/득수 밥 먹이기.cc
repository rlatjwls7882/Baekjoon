#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int N; cin >> N;

    int MOD = 1000000007;

    // 0: 굶기, 1~4: 식당
    long cases[5] = {1, 1, 1, 1, 1};
    while(N-->1) {
        long nextCases[5];
        nextCases[0] = (cases[1]+cases[2]+cases[3]+cases[4])%MOD;
        nextCases[1] = (cases[0]+cases[3]+cases[4])%MOD;
        nextCases[2] = (cases[0]+cases[4])%MOD;
        nextCases[3] = (cases[0]+cases[1])%MOD;
        nextCases[4] = (cases[0]+cases[1]+cases[2])%MOD;
        copy(begin(nextCases), end(nextCases), cases);
    }
    cout << (cases[0]+cases[1]+cases[2]+cases[3]+cases[4])%MOD;
}
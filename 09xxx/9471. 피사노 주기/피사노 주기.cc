#include<bits/stdc++.h>
using namespace std;

int pibo[1000001] = {0, 1, 1, };

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int P; cin >> P;
    while(P-->0) {
        int N, M; cin >> N >> M;

        for(int i=3;i<=1000000;i++) {
            pibo[i] = (pibo[i-1]+pibo[i-2])%M;
            if(pibo[i]==1 && pibo[i-1]==1) {
                cout << N << " " << i-2 << '\n';
                break;
            }
        }
    }
}
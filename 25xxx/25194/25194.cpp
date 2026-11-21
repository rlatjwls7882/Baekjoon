#include<bits/stdc++.h>
using namespace std;

bool possible[1001][7] = {false, };

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int A[N];
    for(int i=0;i<N;i++) {
        cin >> A[i];
    }

    possible[0][0]=true;
    for(int i=1;i<=N;i++) {
        for(int j=i-1;j>=0;j--) {
            for(int k=0;k<7;k++) {
                if(possible[j][k]) {
                    possible[i][(k+A[i-1])%7]=true;
                }
            }
        }
        if(possible[i][4]) {
            cout << "YES";
            return 0;
        }
    }
    cout << "NO";
}
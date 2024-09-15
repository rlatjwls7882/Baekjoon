#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    char want[N];
    for(int i=0;i<N;i++) {
        cin >> want[i];
    }
    char board[2*N];
    for(int i=0;i<N;i++) {
        cin >> board[i];
        board[i+N]=board[i];
    }

    int idx=0;
    int table[N] = {0, };
    for(int i=1;i<N;i++) {
        while(idx>0 && want[i]!=want[idx]) {
            idx = table[idx-1];
        }
        if(want[i]==want[idx]) {
            table[i]=++idx;
        }
    }

    idx=0; int cnt=0;
    for(int i=0;i<2*N-1;i++) {
        while(idx>0 && board[i]!=want[idx]) {
            idx = table[idx-1];
        }
        if(board[i]==want[idx]) {
            if(++idx==N) {
                cnt++;
                idx = table[idx-1];
            }
        }
    }

    int gcdVal = gcd(cnt, N);
    cout << cnt/gcdVal << '/' << N/gcdVal;
}
#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int T; cin >> T;
    while(T-->0) {
        int N; cin >> N;
        if(N%2==0 && pow((int)sqrt(N), 2)!=N) {
            cout << "EMPTY";
        } else {
            if(N%2==1) cout << "O";
            if(pow((int)sqrt(N), 2)==N) cout << "S";
        }
        cout << '\n';
    }
}
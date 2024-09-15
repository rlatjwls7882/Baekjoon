#include<bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int M, N; cin >> M >> N;
    int U, L, R, D; cin >> U >> L >> R >> D;

    string s[M];
    for(int i=0;i<M;i++) {
        cin >> s[i];
    }

    for(int i=0;i<M+U+D;i++) {
        if(U<=i && i<U+M) {
            for(int j=0;j<L+N+R;j++) {
                if(L<=j && j<L+N) {
                    cout << s[i-U][j-L];
                } else if(i%2==j%2) {
                    cout << '#';
                } else {
                    cout << '.';
                }
            }
        } else {
            for(int j=0;j<N+L+R;j++) {
                if(i%2==j%2) {
                    cout << '#';
                } else {
                    cout << '.';
                }
            }
        }
        cout << '\n';
    }
}
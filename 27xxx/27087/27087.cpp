#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int T; cin >> T;
    while(T-->0) {
        int A, B, C, p; cin >> A >> B >> C >> p;
        if(A>=p && B>=p || A>=p && C>=p) {
            if(A%p==0) {
                if(B%p==0 || C%p==0) cout << "1\n";
                else cout << "0\n";
            } else {
                if(B%p==0 && C%p==0) cout << "1\n";
                else cout << "0\n"; 
            }
        } else if(B>=p && C>=p) {
            if(B%p==0) {
                if(A%p==0 || C%p==0) cout << "1\n";
                else cout << "0\n";
            } else {
                if(A%p==0 && C%p==0) cout << "1\n";
                else cout << "0\n"; 
            }
        } else {
            cout << "0\n";
        }
    }
}
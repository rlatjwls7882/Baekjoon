#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    string S; getline(cin, S);
    
    cout << S[0];
    for(int i=1;i<S.length();i++) {
        if(S[i-1]!=S[i]) {
            cout << S[i];
        }
    }
}
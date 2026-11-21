#include <bits/stdc++.h>

using namespace std;

int main(void) {
    int N; cin >> N;
    string S; cin >> S;
    
    bool chk=false;
    for(int i=2;i<N;i++) {
        if(S[i]=='o'&&S[i]==S[i-1]&&S[i-1]==S[i-2]) {
            chk=true;
            break;
        }
    }
    
    cout << (chk ? "Yes" : "No");
}
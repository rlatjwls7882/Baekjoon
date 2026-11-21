#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int N; cin >> N;
    string S; cin >> S;

    int cnt=0;
    for(int i=0;i<N/2;i++) {
        if(S[i]!=S[N-1-i]) {
            cnt++;
            if(S[i]<S[N-1-i]) {
                S[N-1-i]=S[i];
            } else {
                S[i]=S[N-1-i];
            }
        }
    }
    cout << cnt << endl << S;
}
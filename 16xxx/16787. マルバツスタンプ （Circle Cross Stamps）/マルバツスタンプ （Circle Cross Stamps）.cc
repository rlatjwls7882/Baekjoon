#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int N; cin >> N;
    string S; cin >> S;

    int cnt=0;
    for(int i=1;i<N;i++) {
        if(S[i-1]!=S[i]) {
            cnt++;
            i++;
        }
    }
    cout << cnt;
}
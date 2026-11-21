#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    string S1, S2; cin >> S1 >> S2;

    int cnt[S1.length()+1][S2.length()+1];
    for(int i=0;i<=S1.length();i++) {
        cnt[i][0]=0;
    }
    for(int i=0;i<=S2.length();i++) {
        cnt[0][i]=0;
    }

    for(int i=1;i<=S1.length();i++) {
        for(int j=1;j<=S2.length();j++) {
            if(S1[i-1]==S2[j-1]) {
                cnt[i][j] = cnt[i-1][j-1]+1;
            } else {
                cnt[i][j] = max(cnt[i-1][j], cnt[i][j-1]);
            }
        }
    }
    cout << cnt[S1.length()][S2.length()];
}
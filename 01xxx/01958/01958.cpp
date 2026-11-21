#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    string S1, S2, S3; cin >> S1 >> S2 >> S3;

    int cnt[S1.length()+1][S2.length()+1][S3.length()+1];
    for(int i=0;i<=S1.length();i++) {
        for(int j=0;j<=S2.length();j++) {
            for(int k=0;k<=S3.length();k++) {
                if(i==0 || j==0 || k==0) {
                    cnt[i][j][k]=0;
                } else {
                    if(S1[i-1]==S2[j-1]&&S2[j-1]==S3[k-1]) {
                        cnt[i][j][k] = cnt[i-1][j-1][k-1]+1;
                    } else {
                        cnt[i][j][k] = max(max(cnt[i-1][j][k], cnt[i][j-1][k]), cnt[i][j][k-1]);
                    }
                }
            }
        }
    }
    cout << cnt[S1.length()][S2.length()][S3.length()];
}
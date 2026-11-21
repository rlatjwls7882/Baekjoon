#include<bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    int len, P; cin >> len >> P;
    string s; cin >> s;

    int ACGT[4];
    for(int i=0;i<4;i++) {
        cin >> ACGT[i];
    }

    int sum[len+1][4] = {0, };
    for(int i=1;i<=len;i++) {
        for(int j=0;j<4;j++) {
            sum[i][j] = sum[i-1][j];
        }
        if(s[i-1]=='A') {
            sum[i][0]++;
        } else if(s[i-1]=='C') {
            sum[i][1]++;
        } else if(s[i-1]=='G') {
            sum[i][2]++;
        } else {
            sum[i][3]++;
        }
    }

    int cnt=0;
    for(int i=P;i<=len;i++) {
        bool chk=true;
        for(int j=0;j<4;j++) {
            if(ACGT[j]>sum[i][j]-sum[i-P][j]) {
                chk=false;
                break;
            }
        }
        if(chk) {
            cnt++;
        }
    }
    cout << cnt;
}
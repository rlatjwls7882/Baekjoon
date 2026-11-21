#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;

    string s[n];
    int q[n][2];
    for(int i=0;i<n;i++) {
        cin >> s[i] >> q[i][0] >> q[i][1];
    }

    int cnt=0;
    for(int i=123;i<=987;i++) {
        string ss = to_string(i);
        if(ss[1]=='0' || ss[2]=='0' || ss[0]==ss[1] || ss[0]==ss[2] || ss[1]==ss[2]) continue;

        bool chk=true;
        for(int j=0;j<n;j++) {
            int cnt1=0, cnt2=0;
            for(int k=0;k<3;k++) {
                if(s[j][k]==ss[k]) {
                    cnt1++;
                }
                for(int l=0;l<3;l++) {
                    if(k!=l && s[j][k]==ss[l]) {
                        cnt2++;
                    }
                }
            }
            if(cnt1!=q[j][0] || cnt2!=q[j][1]) {
                chk=false;
                break;
            }
        }
        if(chk) cnt++;
    }
    cout << cnt;
}
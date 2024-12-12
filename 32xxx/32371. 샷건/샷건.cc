#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    vector<string> s(4);
    for(int i=0;i<4;i++) cin >> s[i];
    string shotgun; cin >> shotgun;

    for(int i=0;i<2;i++) {
        for(int j=0;j<8;j++) {
            int cnt=0;
            for(int k=0;k<3;k++) {
                for(int l=0;l<3;l++) {
                    for(char ch:shotgun) if(ch==s[i+k][j+l]) cnt++;
                }
            }
            if(cnt==9) {
                cout << s[i+1][j+1];
                return 0;
            }
        }
    }
}
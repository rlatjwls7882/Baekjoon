#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string s; cin >> s;

    int cnt=0;
    int pos[26][2];
    int idx[26] = {0, };
    for(int i=0;i<52;i++) {
        pos[s[i]-'A'][idx[s[i]-'A']++]=i;
    }

    for(int i=0;i<26;i++) {
        for(int j=i+1;j<26;j++) {
            if(!(pos[i][0]<pos[j][0] && pos[j][1]<pos[i][1] || pos[j][0]<pos[i][0] && pos[i][1]<pos[j][1] || pos[i][1]<pos[j][0] || pos[j][1]<pos[i][0])) {
                cnt++;
            }
        }
    }
    cout << cnt;
}
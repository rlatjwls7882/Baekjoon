#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    string s[N];
    for(int i=0;i<N;i++) {
        cin >> s[i];
    }
    int size = s[0].length();

    for(int i=0;;i++) {
        bool chk=true;
        for(int j=0;j<N;j++) {
            for(int k=j+1;k<N;k++) {
                int cnt=0;
                for(int l=size-1;l>=size-1-i;l--) {
                    if(s[j][l]==s[k][l]) {
                        cnt++;
                    }
                }
                if(cnt==i+1) chk=false;
            }
            if(!chk) break;
        }

        if(chk) {
            cout << i+1;
            return 0;
        }
    }
}
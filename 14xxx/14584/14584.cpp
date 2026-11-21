#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string s; cin >> s;
    int N; cin >> N;
    string word[N];
    for(int i=0;i<N;i++) {
        cin >> word[i];
    }

    for(int i=0;i<26;i++) {
        for(int j=0;j<N;j++) {
            int idx=0;
            for(int k=0;k<s.length();k++) {
                if((s[k]-'a'+i)%26+'a'==word[j][idx]) {
                    if(++idx==word[j].length()) {
                        for(int l=0;l<s.length();l++) {
                            cout << char((s[l]-'a'+i)%26+'a');
                        }
                        return 0;
                    }
                } else {
                    idx=0;
                }
            }
        }
    }
}
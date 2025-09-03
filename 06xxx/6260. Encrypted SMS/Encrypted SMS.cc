#include<bits/stdc++.h>
using namespace std;

char prv[] = {'C', 'A', 'B', 'F', 'D', 'E', 'I', 'G', 'H', 'L', 'J', 'K', 'O', 'M', 'N', 'S', 'P', 'Q', 'R', 'V', 'T', 'U', 'Z', 'W', 'X', 'Y'};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    while(true) {
        string s; cin >> s;
        if(s[0]=='#') break;

        for(int i=0;i<s.length();i++) {
            int cnt=i+1;
            while(cnt--) {
                if(s[i]>='a') s[i] = prv[s[i]-'a']+32;
                else s[i] = prv[s[i]-'A'];
            }
        }
        cout << s << '\n';
    }
}
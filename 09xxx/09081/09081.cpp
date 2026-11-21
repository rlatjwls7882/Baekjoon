#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int T; cin >> T;
    while(T-->0) {
        string s; cin >> s;

        int len=1;
        for(int i=s.length()-1;i>0;i--) {
            if(s[i-1]>=s[i]) len++;
            else break;
        }

        if(len!=s.length()) {
            for(int i=s.length()-1;i>s.length()-len-1;i--) {
                if(s[i]>s[s.length()-len-1]) {
                    swap(s[i], s[s.length()-len-1]);
                    break;
                }
            }
            sort(s.begin()+s.length()-len, s.begin()+s.length());
        }
        cout << s << '\n';
    }
}
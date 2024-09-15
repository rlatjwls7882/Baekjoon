#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string s; cin >> s; int pos=0;
    for(int i=1;;i++) {
        string next = to_string(i);
        for(int j=0;j<next.length();j++) {
            if(s[pos]==next[j]) {
                if(++pos==s.length()) {
                    cout << i;
                    return 0;
                }
            }
        }
    }
}
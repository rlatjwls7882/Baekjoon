#include <bits/stdc++.h>

using namespace std;
typedef long long ll;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    string s; cin >> s;
    int k; cin >> k;

    char ch1 = 'z', ch2='z';
    for(int i=0;i<s.length();i++) {
        if(ch1>s[i]) {
            ch1 = s[i];
            ch2 = 'z';
        }
        if(ch1==s[i]) {
            if(i-1>=0) {
                ch2 = min(ch2, s[i-1]);
            }
            if(i+1<s.length()) {
                ch2 = min(ch2, s[i+1]);
            }
        }
    }

    for(int i=0;i<k;i++) {
        if(i%2==0) {
            cout << ch1;
        } else {
            cout << ch2;
        }
    }
}
#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N; cin.ignore();
    int chars[128] = {0, };
    while(N-->0) {
        string s; getline(cin, s);
        for(int i=0;i<s.length();i++) {
            chars[s[i]]++;
        }
    }

    for(int i=0;i<128;i++) {
        if(chars[i] && i!=' ') {
            cout << char(i) << " " << chars[i] << '\n';
        }
    }
}
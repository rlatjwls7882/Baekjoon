#include<bits/stdc++.h>
using namespace std;

set<string> s;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string s1, s2; cin >> s1 >> s2;

    for(int i=0;i<s2.length();i++) {
        s.insert(s2.substr(0, i)+s2.substr(i+1, s2.length()-1-i)); // 삭제
        for(int j=0;j<s1.length();j++) { // 변경
            s.insert(s2.substr(0, i)+(s1[j])+s2.substr(i+1, s2.length()-1-i));
        }
    }
    for(int i=0;i<=s2.length();i++) { // 추가
        for(int j=0;j<s1.length();j++) {
            s.insert(s2.substr(0, i)+(s1[j])+s2.substr(i, s2.length()-i));
        }
    }
    s.erase(s2);

    for(string strings:s) {
        cout << strings << '\n';
    }
}
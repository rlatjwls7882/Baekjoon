#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string s; cin >> s;
    sort(s.begin(), s.begin()+3);
    sort(s.begin()+3, s.begin()+6, greater<char>());
    cout << s[0] << s[3] << s[1] << s[4] << s[2] << s[5];
}
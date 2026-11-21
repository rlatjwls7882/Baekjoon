#include<bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string s; cin >> s;
    
    vector<string> v;
    for(int i=1;i<=s.length();i++) {
        v.push_back(s.substr(s.length()-i, i));
    }
    sort(v.begin(), v.end());

    for(string ss:v) {
        cout << ss << '\n';
    }
}
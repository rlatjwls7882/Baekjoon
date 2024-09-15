#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string s; cin >> s;
    cout << "YES\n" << stoi(s.substr(2, s.length()-2)) << ' ' << (int)pow(10, s.length()-2);
}

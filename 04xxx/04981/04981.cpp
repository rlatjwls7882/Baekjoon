#include<bits/stdc++.h>
using namespace std;

string rev(string s) {
    for(int i=0;i<s.length()/2;i++) swap(s[i], s[s.length()-1-i]);
    return s;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        string s; cin >> s;
        set<string> car;
        for(int i=0;i<s.length();i++) {
            car.insert(s.substr(0, i)+s.substr(i, s.length()-i));
            car.insert(rev(s.substr(0, i))+s.substr(i, s.length()-i));
            car.insert(s.substr(0, i)+rev(s.substr(i, s.length()-i)));
            car.insert(rev(s.substr(0, i))+rev(s.substr(i, s.length()-i)));
            car.insert(s.substr(i, s.length()-i)+s.substr(0, i));
            car.insert(rev(s.substr(i, s.length()-i))+s.substr(0, i));
            car.insert(s.substr(i, s.length()-i)+rev(s.substr(0, i)));
            car.insert(rev(s.substr(i, s.length()-i))+rev(s.substr(0, i)));
        }
        cout << car.size() << '\n';
    }
}
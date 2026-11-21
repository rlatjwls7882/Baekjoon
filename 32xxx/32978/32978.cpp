#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    set<string> s;
    for(int i=0;i<n;i++) {
        string str; cin >> str;
        s.insert(str);
    }

    for(int i=0;i<n-1;i++) {
        string str; cin >> str;
        s.erase(str);
    }
    cout << *s.begin();
}
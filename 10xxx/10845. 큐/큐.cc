#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    queue<int> q;
    while(n--) {
        string s; cin >> s;
        if(s[1]=='u') {
            int x; cin >> x;
            q.push(x);
        } else if(s[1]=='o') {
            if(q.empty()) cout << "-1\n";
            else cout << q.front() << '\n', q.pop();
        } else if(s[1]=='i') {
            cout << q.size() << '\n';
        } else if(s[1]=='m') {
            cout << q.empty() << '\n';
        } else if(s[1]=='r') {
            if(q.empty()) cout << "-1\n";
            else cout << q.front() << '\n';
        } else {
            if(q.empty()) cout << "-1\n";
            else cout << q.back() << '\n';
        }
    }
}
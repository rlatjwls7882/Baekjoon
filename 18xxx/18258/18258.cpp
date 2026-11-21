#include<bits/stdc++.h>
using namespace std;

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;

    queue<int> q;
    while(n--) {
        string s; cin >> s;
        if(s=="push") {
            int x; cin >> x;
            q.push(x);
        } else if(s=="size") {
            cout << q.size() << '\n';
        } else if(s=="empty") {
            cout << (q.size() ? "0\n" : "1\n");
        } else {
            if(q.size()) {
                if(s=="pop") {
                    cout << q.front() << '\n';
                    q.pop();
                } else if(s=="front") {
                    cout << q.front() << '\n';
                } else {
                    cout << q.back() << '\n';
                }
            } else {
                cout << "-1\n";
            }
        }
    }
}
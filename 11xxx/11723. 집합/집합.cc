#include<bits/stdc++.h>
using namespace std;

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int m; cin >> m;

    set<int> s;
    while(m--) {
        string op; cin >> op;
        if(op=="all") {
            for(int i=1;i<=20;i++) s.insert(i);
        } else if(op=="empty") {
            s.clear();
        } else {
            int x; cin >> x;
            if(op=="add") {
                s.insert(x);
            } else if(op=="remove") {
                s.erase(x);
            } else if(op=="check") {
                cout << s.count(x) << '\n';
            } else {
                if(s.count(x)) s.erase(x);
                else s.insert(x);
            }
        }
    }
}
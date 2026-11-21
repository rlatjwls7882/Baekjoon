#include<bits/stdc++.h>
using namespace std;

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;

    deque<int> deq;
    while(n--) {
        int op; cin >> op;

        if(op==1) {
            int x; cin >> x;
            deq.push_front(x);
        } else if(op==2) {
            int x; cin >> x;
            deq.push_back(x);
        } else if(op==3) {
            if(deq.size()) {
                cout << deq.front() << '\n';
                deq.pop_front();
            } else {
                cout << "-1\n";
            }
        } else if(op==4) {
            if(deq.size()) {
                cout << deq.back() << '\n';
                deq.pop_back();
            } else {
                cout << "-1\n";
            }
        } else if(op==5) {
            cout << deq.size() << '\n';
        } else if(op==6) {
            cout << deq.empty() << '\n';
        } else if(op==7) {
            if(deq.size()) cout << deq.front() << '\n';
            else cout << "-1\n";
        } else {
            if(deq.size()) cout << deq.back() << '\n';
            else cout << "-1\n";
        }
    }
}
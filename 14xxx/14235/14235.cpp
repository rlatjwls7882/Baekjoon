#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;

    priority_queue<int> q;
    while(n-->0) {
        int cnt; cin >> cnt;

        if(cnt==0) {
            if(q.empty()) cout << "-1\n";
            else {
                cout << q.top() << '\n'; q.pop(); 
            }
        } else {
            while(cnt-->0) {
                int tmp; cin >> tmp;
                q.push(tmp);
            }
        }
    }
}
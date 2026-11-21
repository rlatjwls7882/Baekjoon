#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    string s; cin >> s;

    queue<char> q;
    for(char ch:s) q.push(ch);

    int cnt=0;
    while(!q.empty()) {
        int idx=0;
        queue<char> next;
        while(!q.empty()) {
            if("quack"[idx%5]==q.front()) {
                idx++;
            } else {
                next.push(q.front());
            }
            q.pop();
        }
        if(idx%5!=0 || idx==0) {
            cout << -1;
            return 0;
        }
        q = next;
        cnt++;
    }
    cout << cnt;
}
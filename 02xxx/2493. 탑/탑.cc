#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    stack<pair<int, int>> stk;
    for(int i=1;i<=N;i++) {
        int h; cin >> h;
        
        while(!stk.empty() && stk.top().first<h) {
            stk.pop();
        }
        if(stk.empty()) cout << "0 ";
        else cout << stk.top().second << ' ';
        stk.push(make_pair(h, i));
    }
}
#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    long long total=0;
    map<int, int> cnt;
    stack<int> stk;
    while(n--) {
        int cur; cin >> cur;
        while(!stk.empty() && stk.top()<cur) {
            int top = stk.top(); stk.pop();
            total++;
            cnt[top]--;
        }
        total += min((int)stk.size(), cnt[cur]+1); // 7 7 5 5 뒤에 5를 넣는 경우 7 5 5 를 볼 수 있음.
        cnt[cur]++;
        stk.push(cur);
    }
    cout << total;
}
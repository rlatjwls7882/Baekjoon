#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    
    stack<pair<int, int>> stk;
    long long score=0;
    while(N-->0) {
        int num; cin >> num;
        if(num==1) {
            int A, T; cin >> A >> T;
            if(--T==0) {
                score += A;
            } else {
                stk.push(pair<int, int>(A, T));
            }
        } else {
            if(!stk.empty() && --stk.top().second==0) {
                score += stk.top().first; stk.pop();
            }
        }
    }
    cout << score;
}
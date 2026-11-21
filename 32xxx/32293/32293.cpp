#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        int n; string s; cin >> n >> s;
        vector<char> stk;
        for(char ch:s) {
            if(ch=='A') {
                stk.push_back('A');
            } else {
                int cnt=0;
                while(stk.size()>=2 && stk[stk.size()-2]=='A' && stk[stk.size()-1]=='B') {
                    cnt++;
                    stk.pop_back();
                    stk.pop_back();
                }
                stk.push_back('B');
                while(cnt--) stk.push_back('A');
            }
        }
        for(char ch:stk) cout << ch;
        cout << '\n';
    }
}
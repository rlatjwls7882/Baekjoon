#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string s; cin >> s;
    stack<char> stk;
    stack<int> cnt;
    int last=0;
    for(int i=0;i<s.length();i++) {
        if(last==2 && s[i]=='A' || (last<=1 || last==3) && s[i]=='P') last++;
        else if(s[i]=='P') last = min(2, last+1);
        else last=0;
        if(last==4) {
            stk.pop();stk.pop();stk.pop();
            cnt.pop();cnt.pop();cnt.pop();
            last=0;
            if(!cnt.empty()) last=cnt.top();
            i--;
        } else {
            stk.push(s[i]);
            cnt.push(last);
        }
    }
    if(stk.size()==1 && stk.top()=='P') cout << "PPAP";
    else cout << "NP";
}
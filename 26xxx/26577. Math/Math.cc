#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    cin.ignore();
    while(n-->0) {
        string s; getline(cin, s);

        stack<int> stk;
        int type=0; // 0: plus, 1: multiply, 2: divide, 3: mod
        int last=0; bool minus=false;
        for(int i=0;i<s.length();i++) {
            if(s[i]=='+') {
                type=0;
            } if(s[i]=='-') {
                minus ^= true;
            } else if(s[i]=='*') {
                type=1;
            } else if(s[i]=='/') {
                type=2;
            } else if(s[i]=='%') {
                type=3;
            } else if('0'<=s[i] && s[i]<='9') {
                last = last*10+s[i]-'0';
            }
            if((s[i]==' ' || i==s.length()-1) && last!=0) {
                if(minus) last = -last;
                if(type==0) stk.push(last);
                else if(type==1) stk.top()*=last;
                else if(type==2) stk.top()/=last;
                else stk.top()%=last;
                last=type=0; minus=false;
            }
        }

        int sum=0;
        while(!stk.empty()) sum += stk.top(), stk.pop();
        cout << sum << '\n';
    }
}
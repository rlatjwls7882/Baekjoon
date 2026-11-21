#include <bits/stdc++.h>
using namespace std;

int main(){
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, P; cin >> N >> P;
    string s; cin >> s;

    s = '('+s;
    for(int i=1;i<s.length();i++) {
        if(s[i]=='+') {
            s.insert(s.begin()+i+1, '(');
            s.insert(s.begin()+i, ')');
            i+=2;
        } else if(s[i]=='(' || s[i]==')') {
            s.insert(s.begin()+i, s[i]);
            i++;
        }
    }
    s += ')';
    cout << s.length() << '\n' << s;
}
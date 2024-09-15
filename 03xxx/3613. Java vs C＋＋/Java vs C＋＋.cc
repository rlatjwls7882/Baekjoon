#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string s; cin >> s;

    if(s[0]=='_' || s[s.length()-1]=='_' || 'A'<=s[0]&&s[0]<='Z') {
        cout << "Error!";
        return 0;
    }

    bool chk1=false, chk2=false;
    vector<char> v;
    for(int i=0;i<s.length();i++) {
        if(s[i]=='_') chk1=true;
        if('A'<=s[i] && s[i]<='Z') chk2=true;
        if(chk1 && chk2 || i+1<s.length()&&s[i]=='_'&&s[i+1]=='_') {
            cout << "Error!";
            return 0;
        }
        if(i-1>=0 && s[i-1]=='_') {
            v.push_back(s[i]-32);
        } else if('A'<=s[i] && s[i]<='Z') {
            v.push_back('_');
            v.push_back(s[i]+32);
        } else if(s[i]!='_') {
            v.push_back(s[i]);
        }
    }

    for(int i=0;i<v.size();i++) {
        cout << v[i];
    }
}
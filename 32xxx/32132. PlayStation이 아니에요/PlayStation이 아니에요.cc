#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    string s; cin >> s;
    int idx=0;
    for(int i=0;i<s.length();i++) {
        if(s[i]=='P') idx=1;
        else if(idx==1 && s[i]=='S') idx=2;
        else if(s[i]!='4' && s[i]!='5') idx=0;
        if(!(idx==2 && (s[i]=='4' || s[i]=='5'))) cout << s[i];
    }
}
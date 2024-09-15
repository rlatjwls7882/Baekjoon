#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string s; cin >> s;
    int cnt1=0, cnt2=0;
    if(s[0]=='A' || s[0]=='D' || s[0]=='E') cnt1++;
    else if(s[0]=='C' || s[0]=='F' || s[0]=='G') cnt2++;

    for(int i=1;i<s.length();i++) {
        if(s[i]=='|') {
            if(s[i+1]=='A' || s[i+1]=='D' || s[i+1]=='E') cnt1++;
            else if(s[i+1]=='C' || s[i+1]=='F' || s[i+1]=='G') cnt2++;
        }
    }

    if(cnt1>cnt2 || cnt1==cnt2 && (s[s.length()-1]=='A' || s[s.length()-1]=='D' || s[s.length()-1]=='E')) cout << "A-minor";
    else cout << "C-major";
}
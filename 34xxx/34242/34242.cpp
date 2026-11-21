#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    string s; cin >> s;
    int n = s.length();

    int cnt=0, erase1=0, erase2=0;
    for(int i=1;i<n-1;i++) {
        if(s[i-1]=='+' && s[i]=='^' && s[i+1]=='+') cnt++;
        else if(s[i-1]=='-' && s[i]=='^' && s[i+1]=='-') cnt--, erase1=1;
        if(i+2<n && (s[i-1]=='+' && s[i]=='-' && s[i+1]=='^' && s[i+2]=='+' || s[i-1]=='+' && s[i]=='^' && s[i+1]=='-' && s[i+2]=='+' || s[i-1]=='+' && s[i]=='^' && s[i+1]=='^' && s[i+2]=='+')) erase1=1;
        if(i+3<n && s[i-1]=='-' && s[i]=='^' && s[i+1]=='-' && s[i+2]=='^' && s[i+3]=='-') erase2=2;
    }
    cout << cnt+max(erase1, erase2);
}
#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    string s; cin >> s;
    int n = s.length();
    
    int llast=-1, last=-1;
    for(int i=0;i<n;i++) {
        if(s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u') {
            llast = last;
            last = i+1;
        }
    }
    
    if(s[n-1]=='a' || s[n-1]=='e' || s[n-1]=='i' || s[n-1]=='o' || s[n-1]=='u' || s[n-1]=='n' || s[n-1]=='s') cout << llast;
    else cout << last;
}
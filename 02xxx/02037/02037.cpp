#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int p, w; cin >> p >> w;
    cin.ignore();
    string s; getline(cin, s);

    int t=0;
    for(int i=0;i<s.length();i++) {
        if(s[i]==' ') {
            t += p;
        } else if(s[i]=='A' || s[i]=='B' || s[i]=='C') {
            if(i-1>=0 && (s[i-1]=='A' || s[i-1]=='B' || s[i-1]=='C')) t +=  w;
            t += (s[i]-'A'+1)*p;
        } else if(s[i]=='D' || s[i]=='E' || s[i]=='F') {
            if(i-1>=0 && (s[i-1]=='D' || s[i-1]=='E' || s[i-1]=='F')) t +=  w;
            t += (s[i]-'D'+1)*p;
        } else if(s[i]=='G' || s[i]=='H' || s[i]=='I') {
            if(i-1>=0 && (s[i-1]=='G' || s[i-1]=='H' || s[i-1]=='I')) t +=  w;
            t += (s[i]-'G'+1)*p;
        } else if(s[i]=='J' || s[i]=='K' || s[i]=='L') {
            if(i-1>=0 && (s[i-1]=='J' || s[i-1]=='K' || s[i-1]=='L')) t +=  w;
            t += (s[i]-'J'+1)*p;
        } else if(s[i]=='M' || s[i]=='N' || s[i]=='O') {
            if(i-1>=0 && (s[i-1]=='M' || s[i-1]=='N' || s[i-1]=='O')) t +=  w;
            t += (s[i]-'M'+1)*p;
        } else if(s[i]=='P' || s[i]=='Q' || s[i]=='R' || s[i]=='S') {
            if(i-1>=0 && (s[i-1]=='P' || s[i-1]=='Q' || s[i-1]=='R' || s[i-1]=='S')) t +=  w;
            t += (s[i]-'P'+1)*p;
        } else if(s[i]=='T' || s[i]=='U' || s[i]=='V') {
            if(i-1>=0 && (s[i-1]=='T' || s[i-1]=='U' || s[i-1]=='V')) t +=  w;
            t += (s[i]-'T'+1)*p;
        } else {
            if(i-1>=0 && (s[i-1]=='W' || s[i-1]=='X' || s[i-1]=='Y' || s[i-1]=='Z')) t +=  w;
            t += (s[i]-'W'+1)*p;
        }
    }
    cout << t;
}
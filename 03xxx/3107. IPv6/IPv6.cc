#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    string s; cin >> s;

    int remain=8;
    if(s[0]!=':') remain--;
    for(int i=0;i<s.length();i++) {
        if(s[i]==':' && i+1<s.length() && s[i+1]!=':') remain--;
    }

    int last=0;
    for(int i=0;i<s.length();i++) {
        if(s[i]==':' && i-1>=0 && s[i-1]==':') {
            for(int j=0;j<remain;j++) {
                if(j!=0) cout << ':';
                cout << "0000";
            }
            if(i!=s.length()-1) cout << ':';
            last=i+1;
        } else if(s[i]==':' && last!=i) {
            for(int j=0;j<4-(i-last);j++) cout << '0';
            for(int j=last;j<i;j++) cout << s[j];
            cout << ':';
            last=i+1;
        } else if(i==s.length()-1) {
            i++;
            for(int j=0;j<4-(i-last);j++) cout << '0';
            for(int j=last;j<i;j++) cout << s[j];
        }
    }
}
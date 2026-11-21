#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string s; getline(cin, s);
    for(int i=0;i<s.length();i++) {
        if(s.substr(i, 12).compare("<div title=\"")==0) {
            cout << "title : ";
            for(i=i+12;i<s.length();i++) {
                if(s[i]=='\"') break;
                cout << s[i];
            }
            cout << '\n';
        } else if(s.substr(i, 3).compare("<p>")==0) {
            bool start=true;
            int blank=0;
            for(i=i+3;i<s.length();i++) {
                if(s.substr(i, 4).compare("</p>")==0) {
                    i=i+3;
                    break;
                }
                if(s[i]=='<') {
                    for(;s[i]!='>';i++);
                    continue;
                }
                if(s[i]!=' ') {
                    if(blank && !start) cout << ' ';
                    cout << s[i];
                    start=false;
                    blank=0;
                }
                else blank++;
            }
            cout << '\n';
        }
    }
}
#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N; cin.ignore();
    bool used[128] = {false, };

    while(N-->0) {
        string s; getline(cin, s);
        bool chk=false;
        for(int i=0;i<s.length();i++) {
            if((i==0 || s[i-1]==' ') && !used[s[i]]) {
                used[s[i]]=true;
                if('a'<=s[i] && s[i]<='z') used[s[i]-32]=true;
                if('A'<=s[i] && s[i]<='Z') used[s[i]+32]=true;
                chk=true;
                for(int j=0;j<i;j++) {
                    cout << s[j];
                }
                cout << '[' << s[i] << ']';
                for(int j=i+1;j<s.length();j++) {
                    cout << s[j];
                }
                cout << '\n';
                break;
            }
        }
        if(chk) continue;

        for(int i=1;i<s.length();i++) {
            if(s[i]!=' ' && !used[s[i]] || s[i-1]==' ' && s[i]==' ') {
                used[s[i]]=true;
                if('a'<=s[i] && s[i]<='z') used[s[i]-32]=true;
                if('A'<=s[i] && s[i]<='Z') used[s[i]+32]=true;
                chk=true;
                for(int j=0;j<i;j++) {
                    cout << s[j];
                }
                cout << '[' << s[i] << ']';
                for(int j=i+1;j<s.length();j++) {
                    cout << s[j];
                }
                cout << '\n';
                break;
            }
        }
        if(chk) continue;
        cout << s << '\n';
    }
}
#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    cin.ignore();
    while(t--) {
        string s; getline(cin, s);
        int n = s.length();

        int cnt=0;
        bool chk=false;
        for(int i=0;i<n;i++) {
            if(s[i]==' ' && chk) {
                chk=false;
                cnt+=10;
            } else if((i-1<0 || s[i-1]==' ') && (i+1>=n || s[i+1]==' ') && s[i]=='u') {
                cnt+=10;
                i++;
            } else if((i-1<0 || s[i-1]==' ') && (i+2>=n || s[i+2]==' ') && i+1<n && s[i]=='u' && s[i+1]=='r') {
                cnt+=10;
                i+=2;
            } else if((i-1<0 || s[i-1]==' ') && (i+9>=n || s[i+9]==' ') && i+8<n && s[i]=='s' && s[i+1]=='h' && s[i+2]=='o' && s[i+3]=='u' && s[i+4]=='l' && s[i+5]=='d' && s[i+6]==' ' && s[i+7]=='o' && s[i+8]=='f') {
                cnt+=10;
                i+=9;
            } else if((i-1<0 || s[i-1]==' ') && (i+8>=n || s[i+8]==' ') && i+7<n && s[i]=='w' && s[i+1]=='o' && s[i+2]=='u' && s[i+3]=='l' && s[i+4]=='d' && s[i+5]==' ' && s[i+6]=='o' && s[i+7]=='f') {
                cnt+=10;
                i+=8;
            } else if(i+2<n && s[i]=='l' && s[i+1]=='o' && s[i+2]=='l') {
                chk=true;
            }
        }
        if(chk) cnt+=10;
        cout << cnt << '\n';
    }
}
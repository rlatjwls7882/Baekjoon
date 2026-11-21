#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    while(true) {
        string s; getline(cin, s);
        if(s.compare("END")==0) break;

        int idx1=-1, idx2=-1;
        for(int i=0;i<s.length();i++) {
            if(s[i]=='"') {
                if(idx1==-1) idx1=i;
                else {
                    idx2=i;
                    break;
                }
            }
        }

        if(idx2+2<s.length() && s[idx2+1]==' ' && s.substr(idx1+1, idx2-idx1-1).compare(s.substr(idx2+2, s.length()-idx2-2))==0) {
            cout << "Quine(" << s.substr(idx1+1, idx2-idx1-1) << ")\n";
        } else {
            cout << "not a quine\n";
        }
    }
}
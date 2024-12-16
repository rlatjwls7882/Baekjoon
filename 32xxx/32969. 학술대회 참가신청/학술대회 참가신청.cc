#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    string s; getline(cin, s);

    for(int i=0;i<s.length();i++) {
        if(s.substr(i, 7).compare("bigdata")==0 || s.substr(i, 6).compare("public")==0 || s.substr(i, 7).compare("society")==0) {
            cout << "public bigdata";
            return 0;
        }
    }
    cout << "digital humanities";
}
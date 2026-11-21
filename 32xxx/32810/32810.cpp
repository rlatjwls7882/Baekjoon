#include<bits/stdc++.h>
using namespace std;

vector<char> encrypted;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    char t; string k, text; cin >> t >> k;
    cin.ignore(); getline(cin, text);
    for(char ch : text) {
        if('a'<=ch && ch<='z') encrypted.push_back(ch);
        else if('A'<=ch && ch<='Z') encrypted.push_back(ch+32);
    }
    k.push_back('a'-1);

    if(t=='E') {
        vector<char> res(encrypted.size(), '_');
        int idx=0;
        for(int i=0;i<k.size();i++) {
            int mv = k[i]-'a'+2;
            int cnt=0;
            if(i%2==0) {
                for(int j=0;j<res.size();j++) {
                    if(res[j]=='_' && ++cnt%mv==0) res[j] = encrypted[idx++];
                }
            } else {
                for(int j=res.size()-1;j>=0;j--) {
                    if(res[j]=='_' && ++cnt%mv==0) res[j] = encrypted[idx++];
                }
            }
        }
        for(char e : res) cout << e;
    } else {
        for(int i=0;i<k.size();i++) {
            int mv = k[i]-'a'+2;
            int cnt=0;
            if(i%2==0) {
                for(int j=0;j<encrypted.size();j++) {
                    if(encrypted[j]!='_' && ++cnt%mv==0) {
                        cout << encrypted[j];
                        encrypted[j]='_';
                    }
                }
            } else {
                for(int j=encrypted.size()-1;j>=0;j--) {
                    if(encrypted[j]!='_' && ++cnt%mv==0) {
                        cout << encrypted[j];
                        encrypted[j]='_';
                    }
                }
            }
        }
    }
}
#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    while(n-->0) {
        string a, b; cin >> a >> b;
        vector<bool> chk(26);
        for(char ch:a) {
            chk[ch-'a']=true;
        }
        
        bool good=true;
        for(char ch:b) {
            if(!chk[ch-'a']) good=false;
        }
        cout << (good?"YES\n":"NO\n");
    }
}
#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    while(true) {
        string s; cin >> s;
        if(s[0]=='0') break;

        vector<char> WFF, KACE;
        int N=0;
        for(int i=0;i<s.length();i++) {
            if(s[i]>='a') WFF.push_back(s[i]);
            else if(s[i]=='N') N++;
            else KACE.push_back(s[i]);
        }

        if(!(N && !WFF.empty() || !KACE.empty() && WFF.size()>=2)) cout << "no WFF possible\n";
        else {
            string res="";
            while(N-->0) res += 'N';

            int cnt = min(KACE.size(), WFF.size()-1);
            for(int i=0;i<cnt;i++) res += KACE[i];
            for(int i=0;i<cnt;i++) res += WFF[i];
            res += WFF[cnt];
            cout << res << '\n';
        }
    }
}
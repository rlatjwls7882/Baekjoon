#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    while(true) {
        int sum=0;
        while(true) {
            string s; cin >> s;
            if(s[0]=='#') return 0;
            if(s[0]=='0') break;

            int val; cin >> s >> val >> s;
            if(s[0]=='F') sum += val*2;
            else if(s[0]=='B') sum += (val*3+1)/2;
            else sum += max(500, val);
        }
        cout << sum << '\n';
    }
}
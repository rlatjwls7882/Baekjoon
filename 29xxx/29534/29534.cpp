#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; string s; cin >> n >> s;
    if(n<s.length()) cout << "Impossible";
    else {
        int cnt=0;
        for(char ch:s) {
            cnt += ch-'a'+1;
        }
        cout << cnt;
    }
}
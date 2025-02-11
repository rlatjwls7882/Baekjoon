#include<bits/stdc++.h>
using namespace std;

int chk[26];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; string a, b; cin >> n >> a >> b;
    for(char ch:a) {
        chk[ch-'a']++;
    }

    int cnt=0;
    for(char ch:b) {
        if(--chk[ch-'a']<0) {
            cnt++;
        }
    }
    cout << cnt;
}
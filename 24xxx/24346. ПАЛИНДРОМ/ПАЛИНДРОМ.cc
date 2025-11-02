#include<bits/stdc++.h>
using namespace std;

int cnt[128];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    string s; cin >> s;
    for(char ch:s) cnt[ch]++;

    int total=0;
    for(int i=0;i<128;i++) {
        if(cnt[i]%2) total++;
    }
    cout << max(1, total);
}
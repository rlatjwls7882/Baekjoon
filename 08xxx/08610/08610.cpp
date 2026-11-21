#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; char ch; string s; cin >> n >> ch >> s;

    for(int i=0;i<26;i++) {
        vector<int> cnt(26);
        for(int j=0;j<n;j++) cnt[(s[j]-'A'+i)%26]++;

        if(*max_element(cnt.begin(), cnt.end())==cnt[ch-'A']) {
            for(int j=0;j<n;j++) cout << (char)((s[j]-'A'+i)%26+'A');
        }
    }
}
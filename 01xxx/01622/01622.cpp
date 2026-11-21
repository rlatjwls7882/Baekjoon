#include<bits/stdc++.h>
using namespace std;

int main() {
    cin.tie(0)->sync_with_stdio(0);
    while(true) {
        string a, b; getline(cin, a); getline(cin, b);
        if(cin.fail()) break;

        vector<int> cnt1(26), cnt2(26);
        for(char ch:a) cnt1[ch-'a']++;
        for(char ch:b) cnt2[ch-'a']++;
        for(int i=0;i<26;i++) {
            for(int j=0;j<min(cnt1[i], cnt2[i]);j++) cout << char(i+'a');
        }
        cout << '\n';
    }
}
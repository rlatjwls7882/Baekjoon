#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    string s; cin >> s;
    int len = s.length()/2;

    int Asum=0, Bsum=0;
    for(int i=0;i<len;i++) { // Divide
        Asum += s[i]-'A';
        Bsum += s[i+len]-'A';
    }

    for(int i=0;i<len;i++) { // Rotate
        s[i] = (s[i]-'A'+Asum%26)%26+'A';
        s[i+len] = (s[i+len]-'A'+Bsum%26)%26+'A';
    }

    for(int i=0;i<len;i++) { // Merge
        cout << char((s[i]-'A'+s[i+len]-'A')%26+'A');
    }
}
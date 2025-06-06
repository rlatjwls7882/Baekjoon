#include<bits/stdc++.h>
using namespace std;

bool used[128];
char change[128];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    string a, b; cin >> a >> b;

    char cur='A';
    for(char ch : a) {
        if(used[ch]) continue;
        used[ch]=true;
        change[cur++] = ch;
    }

    for(char ch='A';ch<='Z';ch++) {
        if(used[ch]) continue;
        change[cur++] = ch;
    }

    for(char ch : b) cout << change[ch];
}
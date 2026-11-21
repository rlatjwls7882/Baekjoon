#include<bits/stdc++.h>
using namespace std;

int n;
string s;

int solve(string p) {
    int ret=0;
    for(int i=0;i<n;i++) {
        if(p[ret%3]==s[i]) ret++;
    }
    return n-(ret-ret%3);
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    cin >> n >> s;
    cout << min({solve("SPR"), solve("PRS"), solve("RSP")});
}
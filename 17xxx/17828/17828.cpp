#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, x; cin >> n >> x;
    if(x<n || n*26<x) {
        cout << '!';
        return 0;
    }

    vector<char> ch;
    while(n) {
        int cur = min(x-n+1, 26);
        ch.push_back(cur+'A'-1);
        n--;
        x -= cur;
    }
    for(int i=ch.size()-1;i>=0;i--) cout << ch[i];
}
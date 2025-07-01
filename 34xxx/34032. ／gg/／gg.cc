#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; string s; cin >> n >> s;

    int cnt=0;
    for(char ch:s) if(ch=='O') cnt++;
    cout << (cnt*2>=n ? "Yes" : "No");
}
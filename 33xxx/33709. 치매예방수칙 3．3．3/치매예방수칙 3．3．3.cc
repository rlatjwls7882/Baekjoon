#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; string s; cin >> n >> s;
    
    int total=0, last=0;
    for(char ch:s) {
        if(ch=='.' || ch=='|' || ch==':' || ch=='#') {
            total += last;
            last=0;
        } else {
            last = last*10 + ch-'0';
        }
    }
    cout << total + last;
}
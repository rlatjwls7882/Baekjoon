#include<bits/stdc++.h>
using namespace std;

bool block[1001][1001];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, k; cin >> n >> k;
    while(n--) {
        int x, y; cin >> x >> y;
        block[y+500][x+500]=true;
    }

    string s; cin >> s;
    int x=500, y=500;
    for(char ch : s) {
        int nx=x, ny=y;
        if(ch=='U') ny++;
        else if(ch=='D') ny--;
        else if(ch=='R') nx++;
        else nx--;
        if(!block[ny][nx]) x=nx, y=ny;
    }
    cout << x-500 << ' ' << y-500;
}
#include<bits/stdc++.h>
using namespace std;

int n;
string s;
bool ch[5][20'002];

int chk(int i) {
    if(ch[0][i]) {
        if(ch[1][i] && ch[0][i+1] && !ch[2][i+1]) return 0;
        if(ch[4][i] && !ch[0][i+1]) return 1;
        if(!ch[1][i] && ch[2][i] && ch[3][i]) return 2;
        if(!ch[1][i] && ch[2][i]) return 3;
        if(!ch[0][i+1]) return 4;
        if(!ch[1][i+2] && !ch[3][i]) return 5;
        if(!ch[1][i+2]) return 6;
        if(!ch[1][i]) return 7;
        if(ch[3][i]) return 8;
        return 9;
    }
    return -1;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> s;

    n /= 5;
    for(int i=0;i<5*n;i++) ch[i/n][i%n] = s[i]=='#';

    for(int i=0;i<n;i++) {
        int ret = chk(i);
        if(ret!=-1) {
            if(ret!=1) i+=3;
            cout << ret;
        }
    }
}
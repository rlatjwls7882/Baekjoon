#include<bits/stdc++.h>
using namespace std;

string s[5];
bool chk, used[12];
vector<pair<int, int>> x;

void back(int depth) {
    if(chk) return;
    if(depth==x.size()) {
        if(s[1][1]+s[1][3]+s[1][5]+s[1][7]==282
        && s[3][1]+s[3][3]+s[3][5]+s[3][7]==282
        && s[0][4]+s[1][5]+s[2][6]+s[3][7]==282
        && s[1][1]+s[2][2]+s[3][3]+s[4][4]==282
        && s[3][1]+s[2][2]+s[1][3]+s[0][4]==282
        && s[4][4]+s[3][5]+s[2][6]+s[1][7]==282
        ) {
            for(int i=0;i<5;i++) cout << s[i] << '\n';
            chk=true;
        }
        return;
    }
    for(int i=0;i<12;i++) {
        if(!used[i]) {
            used[i]=true;
            s[x[depth].first][x[depth].second]=i+'A';
            back(depth+1);
            used[i]=false;
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    for(int i=0;i<5;i++) {
        cin >> s[i];
        for(int j=0;j<9;j++) {
            if(s[i][j]=='x') {
                x.push_back({i, j});
            } else if(s[i][j]>='A') {
                used[s[i][j]-'A']=true;
            }
        }
    }
    back(0);
}
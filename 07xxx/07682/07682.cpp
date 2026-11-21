#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    while(true) {
        string s; cin >> s;
        if(s.compare("end")==0) break;

        int blank=0, rowBingo=0, colBingo=0, crossBingo=0, cntO=0, cntX=0;
        bool winO=false, winX=false;
        for(int i=0;i<9;i++) {
            if(s[i]=='.') blank++;
            else if(s[i]=='O') cntO++;
            else cntX++;
        }
        for(int i=0;i<3;i++) {
            if(s[i]!='.' && s[i]==s[i+3] && s[i+3]==s[i+6]) {
                rowBingo++;
                if(s[i]=='O') winO=true;
                else winX=true;
            }
            if(s[i*3]!='.' && s[i*3]==s[i*3+1] && s[i*3+1]==s[i*3+2]) {
                colBingo++;
                if(s[i*3]=='O') winO=true;
                else winX=true;
            }
        }
        if(s[0]!='.' && s[0]==s[4] && s[4]==s[8]) {
            if(s[0]=='O') winO=true;
            else winX=true;
            crossBingo++;
        }
        if(s[2]!='.' && s[2]==s[4] && s[4]==s[6]) {
            if(s[2]=='O') winO=true;
            else winX=true;
            crossBingo++;
        }

        int bingoSum = rowBingo+colBingo+crossBingo;
        if(!(winX && winO) && !(winX && cntX!=cntO+1) && !(winO && cntX!=cntO) && (1<=bingoSum && bingoSum<=2 && colBingo<=1 && rowBingo<=1 && crossBingo<=2 || blank==0 && bingoSum==0 && cntX==cntO+1)) cout << "valid\n";
        else cout << "invalid\n";
    }
}
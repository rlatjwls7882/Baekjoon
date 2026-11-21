#include<bits/stdc++.h>
using namespace std;

string num[10] = {
    {"GGGgGGG"},
    {"gggggGG"},
    {"gGGGGGg"},
    {"ggGGGGG"},
    {"GggGgGG"},
    {"GgGGGgG"},
    {"GGGGGgG"},
    {"ggGggGG"},
    {"GGGGGGG"},
    {"GgGGGGG"}
};

void chk(string s) {
    int res=-1;
    for(int i=0;i<=9;i++) {
        bool match=true;
        for(int j=0;j<7;j++) {
            if(s[j]!='+' && s[j]!='-' && s[j]!=num[i][j]) match=false;
        }
        if(match) {
            if(res!=-1) {
                res=-1;
                break;
            }
            res=i;
        }
    }
    cout << (res==-1 ? "*" : to_string(res));
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    while(n--) {
        string s; cin >> s;
        chk(s);
    }
}
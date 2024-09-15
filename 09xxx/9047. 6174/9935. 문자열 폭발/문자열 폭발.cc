#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string s, expl; cin >> s >> expl;

    vector<char> chars;
    vector<char> cnt;

    int curCnt=0;
    for(char ch:s) {
        chars.push_back(ch);

        if(ch==expl[curCnt]) {
            curCnt++;
        } else {
            if(ch==expl[0]) curCnt=1;
            else curCnt=0;
        }
        cnt.push_back(curCnt);

        if(curCnt==expl.size()) {
            for(int i=0;i<expl.size();i++) {
                chars.pop_back();
                cnt.pop_back();
            }
            curCnt = cnt.back();
        }
    }

    if(chars.empty()) {
        cout << "FRULA";
    } else {
        for(char ch:chars) {
            cout << ch;
        }
    }
}
#include<bits/stdc++.h>
using namespace std;

int main() {
    cin.tie(0)->sync_with_stdio(0);

    string s;
    int res1=0, res2=0, option=1;
    while(true) {
        if(option) cin >> s;
        if(cin.fail()) break;
        option=1;

        if(s=="se") {
            res1++;
            res2++;
            int idx=0;
            vector<string> remain = {"no", "hai-", "hai-", "hai", "hai", "hai", "hai"};
            while(idx<7) {
                cin >> s;
                if(remain[idx]==s) idx++;
            }
            option=0;
            idx=0;
            while(true) {
                cin >> s;
                if(cin.fail() || s=="se" || s=="mik-jjang" || s=="Are" || !(idx%2) && s=="hai") break;
                if(s=="u-" || s=="hai") idx++;
            }
        } else if(s=="Are") {
            res1++;
            res2++;
            int idx=0;
            vector<string> remain = {"you", "ready", "antena", "senku", "high!"};
            while(idx<5) {
                cin >> s;
                if(remain[idx]==s) idx++;
            }
        } else if(s=="mik-jjang") {
            res1++;
            res2++;
            while(true) {
                cin >> s;
                if(s=="kawaii!") break;
            }
        } else if(s=="u- ") {
            res2++;
            while(true) {
                cin >> s;
                if(s=="hai") break;
            }
        } else if(s=="hai") {
            res2++;
        }
    }
    cout << res1 << ' ' << res2;
}
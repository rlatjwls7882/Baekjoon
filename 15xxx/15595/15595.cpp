#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    
    set<string> s; s.insert("megalusion");
    map<string, int> failCnt;
    double correct=0, fail=0;
    while(N-->0) {
        int tmp, res; string name; cin >> tmp >> name >> res >> tmp >> tmp >> tmp >> tmp;
        if(!s.count(name)) {
            if(res==4) {
                correct++;
                s.insert(name);
                fail += failCnt[name];
            } else {
                failCnt[name]++;
            }
        }
    }

    cout.precision(9);
    cout << fixed;

    if(correct==0) cout << 0;
    else cout << correct*100/(fail+correct);
}
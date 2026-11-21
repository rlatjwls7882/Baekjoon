#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N, M; cin >> N >> M;

    string last; cin >> last;
    while(N-->1) {
        string cur; cin >> cur;
        bool chk=false;
        for(int len=1;len<=M;len++) {
            if(cur.substr(0, len).compare(last.substr(M-len, len))==0 || cur.substr(M-len, len).compare(last.substr(0, len))==0) {
                chk=true;
                break;
            }
        }
        if(!chk) {
            cout << 0;
            return 0;
        }
        last = cur;
    }
    cout << 1;
}
#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string S, E, Q; cin >> S >> E >> Q;
    int start = ((S[0]-'0')*10+S[1]-'0')*60+((S[3]-'0')*10+S[4]-'0');
    int end = ((E[0]-'0')*10+E[1]-'0')*60+((E[3]-'0')*10+E[4]-'0');
    int endStreaming = ((Q[0]-'0')*10+Q[1]-'0')*60+((Q[3]-'0')*10+Q[4]-'0');

    set<string> s;
    set<string> chk;
    while(true) {
        string a, b; cin >> a >> b;
        if(cin.fail()) break;
        int time = ((a[0]-'0')*10+a[1]-'0')*60+((a[3]-'0')*10+a[4]-'0');

        if(time<=start) {
            s.insert(b);
        } else if(end<=time && time<=endStreaming && s.count(b)) {
            chk.insert(b);
        }
    }
    cout << chk.size();
}
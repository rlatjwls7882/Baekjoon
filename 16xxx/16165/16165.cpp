#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    map<string, string> m1;
    map<string, vector<string>> m2;
    while(N-->0) {
        string teamName; cin >> teamName;
        int cnt; cin >> cnt;
        m2.insert(pair<string, vector<string>>(teamName, vector<string>()));
        while(cnt-->0) {
            string member; cin >> member;
            m1.insert(pair<string, string>(member, teamName));
            m2[teamName].push_back(member);
        }
        sort(m2[teamName].begin(), m2[teamName].end());
    }

    while(M-->0) {
        int type; string name; cin >> name >> type;
        if(type==0) {
            for(string member:m2[name]) {
                cout << member << '\n';
            }
        } else {
            cout << m1[name] << '\n';
        }
    }
}
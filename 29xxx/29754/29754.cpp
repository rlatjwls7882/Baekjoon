#include<bits/stdc++.h>
using namespace std;

map<string, pair<int, int>> youtuber[52]; // [week]{name, {cnt, minute}}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, m; cin >> n >> m;
    while(n-->0) {
        string name, start, end; int day; cin >> name >> day >> start >> end;
        int time = ((end[0]-'0')*10+end[1]-'0')*60+((end[3]-'0')*10+end[4]-'0') - ((start[0]-'0')*10+start[1]-'0')*60+((start[3]-'0')*10+start[4]-'0');
        youtuber[(day-1)/7][name].first++;
        youtuber[(day-1)/7][name].second+=time;
    }

    set<string> real_youtuber;
    for(auto pairs:youtuber[0]) {
        bool chk=true;
        for(int i=0;i<m/7;i++) {
            if(youtuber[i][pairs.first].first<5 || youtuber[i][pairs.first].second<3600) {
                chk=false;
                break;
            }
        }
        if(chk) real_youtuber.insert(pairs.first);
    }

    if(real_youtuber.empty()) cout << -1;
    else for(string name:real_youtuber) cout << name << '\n';
}
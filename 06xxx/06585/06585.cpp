#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    for(int tc=1;;tc++) {
        int t; cin >> t;
        if(!t) return 0;
        cout << "Scenario #" << tc << "\n";

        map<int, int> teamIdx;
        for(int i=0;i<t;i++) {
            int cnt; cin >> cnt;
            while(cnt--) {
                int tmp; cin >> tmp;
                teamIdx[tmp]=i;
            }
        }

        queue<int> elementQueue[t]; // 각각의 팀의 남은 요소들
        queue<int> teamsQueue; // 큐에 남아있는 팀들 순서
        while(true) {
            string s; cin >> s;
            if(s.compare("STOP")==0) break;
            if(s.compare("ENQUEUE")==0) {
                int x; cin >> x;
                if(elementQueue[teamIdx[x]].empty()) teamsQueue.push(teamIdx[x]);
                elementQueue[teamIdx[x]].push(x);
            } else {
                cout << elementQueue[teamsQueue.front()].front() << '\n';
                elementQueue[teamsQueue.front()].pop();
                if(elementQueue[teamsQueue.front()].empty()) teamsQueue.pop();
            }
        }
        cout << '\n';
    }
}
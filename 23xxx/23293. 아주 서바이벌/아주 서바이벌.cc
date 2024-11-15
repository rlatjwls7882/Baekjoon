#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int T, N; cin >> T >> N;

    vector<map<int, int>> items(N);
    vector<int> pos(N, 1);
    vector<int> errorLine;
    set<int> banPlayer;
    while(T-->0) {
        int lineNum, playerNum, activity; char activityType; cin >> lineNum >> playerNum >> activityType >> activity;
        if(activityType=='M') {
            pos[playerNum-1] = activity;
        } else if(activityType=='F') {
            if(pos[playerNum-1]!=activity) errorLine.push_back(lineNum);
            items[playerNum-1][activity]++;
        } else if(activityType=='C') {
            int activity2; cin >> activity2;
            if(!items[playerNum-1][activity] || !items[playerNum-1][activity2]) errorLine.push_back(lineNum);
            if(items[playerNum-1][activity]) items[playerNum-1][activity]--;
            if(items[playerNum-1][activity2]) items[playerNum-1][activity2]--;
        } else {
            if(pos[playerNum-1]!=pos[activity-1]) {
                errorLine.push_back(lineNum);
                banPlayer.insert(playerNum);
            }
        }
    }

    cout << errorLine.size() << '\n';
    for(int e:errorLine) cout << e << ' ';
    if(!errorLine.empty()) cout << '\n';
    cout << banPlayer.size() << '\n';
    for(int e:banPlayer) cout << e << ' ';
}
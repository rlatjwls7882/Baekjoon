#include<bits/stdc++.h>
using namespace std;

int n, m;
vector<set<int>> teams, minSizeTeam(7);
bool dislike[7][7];

void dfs(int depth) {
    if(depth==n) {
        if(minSizeTeam.size()>teams.size()) {
            minSizeTeam = teams;
        }
        return;
    }
    for(int i=0;i<teams.size();i++) {
        bool chk=true;
        for(int member:teams[i]) {
            if(dislike[depth][member]) {
                chk=false;
                break;
            }
        }
        if(chk) {
            teams[i].insert(depth);
            dfs(depth+1);
            teams[i].erase(depth);
        }
    }
    teams.push_back({depth});
    dfs(depth+1);
    teams.pop_back();
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> n >> m;
    while(m-->0) {
        int a, b; cin >> a >> b;
        dislike[a-1][b-1]=dislike[b-1][a-1]=true;
    }
    dfs(0);

    cout << minSizeTeam.size() << '\n';
    for(auto team:minSizeTeam) {
        for(int member:team) cout << member+1 << ' ';
        cout << '\n';
    }
}
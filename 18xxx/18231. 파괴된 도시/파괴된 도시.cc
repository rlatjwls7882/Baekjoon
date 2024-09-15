#include<bits/stdc++.h>
#define MAX 2001
using namespace std;

int N;
bool broken[MAX] = {false, };
bool chk[MAX] = {false, };
vector<vector<int>> connect = vector<vector<int>>(MAX);

bool canBreak(int cur) {
    for(int next:connect[cur]) {
        if(!broken[next]) return false;
    }
    return true;
}

void breakAdjacent(int cur) {
    chk[cur]=true;
    for(int next:connect[cur]) {
        chk[next]=true;
    }
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int M; cin >> N >> M;
    while(M-->0) {
        int a, b; cin >> a >> b;
        connect[a].push_back(b);
        connect[b].push_back(a);
    }

    int T; cin >> T;
    while(T-->0) {
        int a; cin >> a;
        broken[a]=true;
    }

    vector<int> bomb;
    for(int i=1;i<=N;i++) {
        if(broken[i] && canBreak(i)) {
            bomb.push_back(i);
            breakAdjacent(i);
        }
    }

    for(int i=1;i<=N;i++) {
        if(broken[i]!=chk[i]) {
            cout << -1;
            return 0;
        }
    }

    cout << bomb.size() << '\n';
    for(int i=0;i<bomb.size();i++) {
        cout << bomb[i] << ' ';
    }
}
#include<bits/stdc++.h>
using namespace std;

struct Pos {
    int nodeNum;
    double cost;
    Pos(int nodeNum, double cost) {
        this->nodeNum=nodeNum;
        this->cost=cost;
    }

    bool operator<(const Pos a) const {
        return this->cost>a.cost;
    }
};

double calcDist(int a[], int b[]) {
    return sqrt(pow(a[0]-b[0], 2)+pow(a[1]-b[1], 2));
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, F; cin >> N >> F;
    vector<vector<int>> connect = vector<vector<int>>(N+1);
    map<pair<int, int>, int> m;
    m[make_pair(0, 0)]=0;

    int point[N+1][2];
    point[0][0]=point[0][1]=0;
    for(int i=1;i<=N;i++) {
        cin >> point[i][0] >> point[i][1];
        m[make_pair(point[i][0], point[i][1])]=i;
    }

    for(int i=0;i<=N;i++) {
        for(int x=-2;x<=2;x++) {
            for(int y=-2;y<=2;y++) {
                if(m.count(make_pair(point[i][0]+x, point[i][1]+y))) {
                    connect[i].push_back(m[make_pair(point[i][0]+x, point[i][1]+y)]);
                }
            }
        }
    }

    priority_queue<Pos> pq; pq.push(Pos(0, 0));
    bool visited[N+1] = {false, };
    while(!pq.empty()) {
        Pos cur = pq.top(); pq.pop();
        if(visited[cur.nodeNum]) continue;
        visited[cur.nodeNum]=true;
        if(point[cur.nodeNum][1]==F) {
            cout << (int)(cur.cost+0.5);
            return 0;
        }

        for(int nextNode:connect[cur.nodeNum]) {
            if(!visited[nextNode]) {
                pq.push(Pos(nextNode, cur.cost+calcDist(point[cur.nodeNum], point[nextNode])));
            }
        }
    }
    cout << -1;
}
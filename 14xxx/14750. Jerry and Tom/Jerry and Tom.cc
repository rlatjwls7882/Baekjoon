#include<bits/stdc++.h>
using namespace std;

typedef long long ll; // 오버플로우 조심
const int INF = 0x3f3f3f3f;
const int MAX = 302;
const int S = MAX-2;
const int E = MAX-1;
int f[MAX][MAX], c[MAX][MAX];
int prv[MAX];

struct pos {
    ll x, y;
};

struct wall {
    ll x1, y1, x2, y2;
};

int n, k, h, m;
vector<wall> walls;
vector<vector<int>> conn(MAX);
vector<pos> hole(50), corner(1000), mouse(250);

bool oneLine(wall w1, wall w2) {
    return w1.x1!=w1.x2 && (max(w1.x1, w1.x2) < min(w2.x1, w2.x2) || max(w2.x1, w2.x2) < min(w1.x1, w1.x2))
        || w1.y1!=w1.y2 && (max(w1.y1, w1.y2) < min(w2.y1, w2.y2) || max(w2.y1, w2.y2) < min(w1.y1, w1.y2));
}

bool crossChk(wall w1, wall w2) { // 선분 교차 판정
    pos vec1 = {w1.x2-w1.x1, w1.y2-w1.y1};
    pos vec2 = {w2.x1-w1.x2, w2.y1-w1.y2};
    pos vec3 = {w2.x2-w1.x2, w2.y2-w1.y2};

    ll a = vec1.x*vec2.y - vec2.x*vec1.y;
    ll b = vec1.x*vec3.y - vec3.x*vec1.y;
    return (a<0 && b<0 || a>0 && b>0 || a==0 && b==0 && oneLine(w1, w2)); // a=0, b=0인 경우는 두 선분이 일렬인 경우
}

bool isCorner(wall mouse, wall w) {
    return (mouse.x2==w.x1 && mouse.y2==w.y1 || mouse.x2==w.x2 && mouse.y2==w.y2);
}

bool canGo(wall mouse) {
    int cnt=0; // 쥐가 이동하면서 만나는 벽의 개수
    bool chk=false; // 구멍이 꼭짓점에 있는 경우
    for(int i=0;i<n;i++) {
        if(!crossChk(mouse, walls[i]) && !crossChk(walls[i], mouse)) {
            cnt++;
        }
        chk |= isCorner(mouse, walls[i]);
    }
    return (!chk && cnt==1 || chk && cnt==2); // 도착지점 한곳에서만 벽을 만나야함. (구멍이 꼭짓점에 있는 경우 벽 두개)
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> k >> h >> m;

    // 벽의 꼭짓점
    for(int i=0;i<n;i++) cin >> corner[i].x >> corner[i].y;

    // 벽 위치 기록하기
    for(int i=0;i<n;i++) walls.push_back({corner[i].x, corner[i].y, corner[(i+1)%n].x, corner[(i+1)%n].y});

    // 구멍 위치
    for(int i=0;i<h;i++) cin >> hole[i].x >> hole[i].y;

    // 쥐 위치
    for(int i=0;i<m;i++) cin >> mouse[i].x >> mouse[i].y;

    // S -> mouse 연결
    for(int i=0;i<m;i++) {
        conn[S].push_back(i);
        conn[i].push_back(S);
        c[S][i]=1;
    }

    // mouse -> hole 연결
    for(int i=0;i<m;i++) {
        for(int j=0;j<h;j++) {
            if(canGo({mouse[i].x, mouse[i].y, hole[j].x, hole[j].y})) {
                conn[i].push_back(m+j);
                conn[m+j].push_back(i);
                c[i][m+j]=1;
            }
        }
    }

    // hole -> E 연결
    for(int i=0;i<h;i++) {
        conn[m+i].push_back(E);
        conn[E].push_back(m+i);
        c[m+i][E]=k;
    }

    // 에드몬드 카프
    int totalFlow=0;
    while(true) {
        queue<int> q; q.push(S);
        memset(prv, -1, sizeof prv);
        while(!q.empty() && prv[E]==-1) {
            int cur = q.front(); q.pop();
            for(int next:conn[cur]) {
                if(c[cur][next]-f[cur][next]>0 && prv[next]==-1) {
                    prv[next]=cur;
                    if(next==E) break;
                    q.push(next);
                }
            }
        }
        if(prv[E]==-1) break;

        for(int i=E;i!=S;i=prv[i]) {
            f[prv[i]][i]++;
            f[i][prv[i]]--;
        }
        totalFlow++;
    }
    if(totalFlow==m) cout << "Possible";
    else cout << "Impossible";
}
#include<bits/stdc++.h>
using namespace std;

int moveX[4] = {1, -1, 0, 0};
int moveY[4] = {0, 0, 1, -1};

struct Pos {
    int x, y, c;
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M, P; cin >> N >> M >> P;
    int S[P];
    for(int i=0;i<P;i++) {
        cin >> S[i];
    }

    string m[N];
    for(int i=0;i<N;i++) {
        cin >> m[i];
    }

    queue<Pos> q[P];
    int remain = N*M;
    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            if(m[i][j]=='#') {
                remain--;
            } else if(m[i][j]!='.') {
                q[m[i][j]-'1'].push({i, j, 0});
                remain--;
            }
        }
    }

    bool changed=true;
    for(int t=1;remain && changed;t++) {
        changed=false;
        for(int i=0;i<P && remain;i++) {
            while(!q[i].empty()) {
                Pos cur = q[i].front();
                if(cur.c==t*S[i]) break;
                q[i].pop();

                for(int j=0;j<4;j++) {
                    Pos next = {cur.x+moveX[j], cur.y+moveY[j], cur.c+1};
                    if(next.x<0 || next.x>=N || next.y<0 || next.y>=M || m[next.x][next.y]!='.') continue;
                    remain--;
                    m[next.x][next.y]='1'+i;
                    q[i].push(next);
                    changed=true;
                }
            }
        }
    }

    int cnt[P] = {0, };
    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            if(m[i][j]!='#' && m[i][j]!='.') {
                cnt[m[i][j]-'1']++;
            }
        }
    }

    for(int i=0;i<P;i++) {
        cout << cnt[i] << ' ';
    }
}
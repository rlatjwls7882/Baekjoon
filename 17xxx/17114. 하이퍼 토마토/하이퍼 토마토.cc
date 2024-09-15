#include<bits/stdc++.h>
using namespace std;

int mov[2] = {1, -1};

struct Pos {
    int a, b, c, d, e, f, g, h, i, j, k, cost;
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int m, n, o, p, q, r, s, t, u, v, w; cin >> m >> n >> o >> p >> q >> r >> s >> t >> u >> v >> w;

    int box[w][v][u][t][s][r][q][p][o][n][m];

    queue<Pos> qu;
    for(int a=0;a<w;a++) {
        for(int b=0;b<v;b++) {
            for(int c=0;c<u;c++) {
                for(int d=0;d<t;d++) {
                    for(int e=0;e<s;e++) {
                        for(int f=0;f<r;f++) {
                            for(int g=0;g<q;g++) {
                                for(int h=0;h<p;h++) {
                                    for(int i=0;i<o;i++) {
                                        for(int j=0;j<n;j++) {
                                            for(int k=0;k<m;k++) {
                                                cin >> box[a][b][c][d][e][f][g][h][i][j][k];
                                                if(box[a][b][c][d][e][f][g][h][i][j][k]==1) qu.push({a, b, c, d, e, f, g, h, i, j, k, 0});
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    int maxCost=0;
    while(!qu.empty()) {
        Pos cur = qu.front(); qu.pop();
        maxCost = max(maxCost, cur.cost);

        for(int i=0;i<2;i++) {
            if(0<=cur.a+mov[i] && cur.a+mov[i]<w && !box[cur.a+mov[i]][cur.b][cur.c][cur.d][cur.e][cur.f][cur.g][cur.h][cur.i][cur.j][cur.k]) {
                qu.push({cur.a+mov[i], cur.b, cur.c, cur.d, cur.e, cur.f, cur.g, cur.h, cur.i, cur.j, cur.k, cur.cost+1});
                box[cur.a+mov[i]][cur.b][cur.c][cur.d][cur.e][cur.f][cur.g][cur.h][cur.i][cur.j][cur.k]=1;
            }
            if(0<=cur.b+mov[i] && cur.b+mov[i]<v && !box[cur.a][cur.b+mov[i]][cur.c][cur.d][cur.e][cur.f][cur.g][cur.h][cur.i][cur.j][cur.k]) {
                qu.push({cur.a, cur.b+mov[i], cur.c, cur.d, cur.e, cur.f, cur.g, cur.h, cur.i, cur.j, cur.k, cur.cost+1});
                box[cur.a][cur.b+mov[i]][cur.c][cur.d][cur.e][cur.f][cur.g][cur.h][cur.i][cur.j][cur.k]=1;
            }
            if(0<=cur.c+mov[i] && cur.c+mov[i]<u && !box[cur.a][cur.b][cur.c+mov[i]][cur.d][cur.e][cur.f][cur.g][cur.h][cur.i][cur.j][cur.k]) {
                qu.push({cur.a, cur.b, cur.c+mov[i], cur.d, cur.e, cur.f, cur.g, cur.h, cur.i, cur.j, cur.k, cur.cost+1});
                box[cur.a][cur.b][cur.c+mov[i]][cur.d][cur.e][cur.f][cur.g][cur.h][cur.i][cur.j][cur.k]=1;
            }
            if(0<=cur.d+mov[i] && cur.d+mov[i]<t && !box[cur.a][cur.b][cur.c][cur.d+mov[i]][cur.e][cur.f][cur.g][cur.h][cur.i][cur.j][cur.k]) {
                qu.push({cur.a, cur.b, cur.c, cur.d+mov[i], cur.e, cur.f, cur.g, cur.h, cur.i, cur.j, cur.k, cur.cost+1});
                box[cur.a][cur.b][cur.c][cur.d+mov[i]][cur.e][cur.f][cur.g][cur.h][cur.i][cur.j][cur.k]=1;
            }
            if(0<=cur.e+mov[i] && cur.e+mov[i]<s && !box[cur.a][cur.b][cur.c][cur.d][cur.e+mov[i]][cur.f][cur.g][cur.h][cur.i][cur.j][cur.k]) {
                qu.push({cur.a, cur.b, cur.c, cur.d, cur.e+mov[i], cur.f, cur.g, cur.h, cur.i, cur.j, cur.k, cur.cost+1});
                box[cur.a][cur.b][cur.c][cur.d][cur.e+mov[i]][cur.f][cur.g][cur.h][cur.i][cur.j][cur.k]=1;
            }
            if(0<=cur.f+mov[i] && cur.f+mov[i]<r && !box[cur.a][cur.b][cur.c][cur.d][cur.e][cur.f+mov[i]][cur.g][cur.h][cur.i][cur.j][cur.k]) {
                qu.push({cur.a, cur.b, cur.c, cur.d, cur.e, cur.f+mov[i], cur.g, cur.h, cur.i, cur.j, cur.k, cur.cost+1});
                box[cur.a][cur.b][cur.c][cur.d][cur.e][cur.f+mov[i]][cur.g][cur.h][cur.i][cur.j][cur.k]=1;
            }
            if(0<=cur.g+mov[i] && cur.g+mov[i]<q && !box[cur.a][cur.b][cur.c][cur.d][cur.e][cur.f][cur.g+mov[i]][cur.h][cur.i][cur.j][cur.k]) {
                qu.push({cur.a, cur.b, cur.c, cur.d, cur.e, cur.f, cur.g+mov[i], cur.h, cur.i, cur.j, cur.k, cur.cost+1});
                box[cur.a][cur.b][cur.c][cur.d][cur.e][cur.f][cur.g+mov[i]][cur.h][cur.i][cur.j][cur.k]=1;
            }
            if(0<=cur.h+mov[i] && cur.h+mov[i]<p && !box[cur.a][cur.b][cur.c][cur.d][cur.e][cur.f][cur.g][cur.h+mov[i]][cur.i][cur.j][cur.k]) {
                qu.push({cur.a, cur.b, cur.c, cur.d, cur.e, cur.f, cur.g, cur.h+mov[i], cur.i, cur.j, cur.k, cur.cost+1});
                box[cur.a][cur.b][cur.c][cur.d][cur.e][cur.f][cur.g][cur.h+mov[i]][cur.i][cur.j][cur.k]=1;
            }
            if(0<=cur.i+mov[i] && cur.i+mov[i]<o && !box[cur.a][cur.b][cur.c][cur.d][cur.e][cur.f][cur.g][cur.h][cur.i+mov[i]][cur.j][cur.k]) {
                qu.push({cur.a, cur.b, cur.c, cur.d, cur.e, cur.f, cur.g, cur.h, cur.i+mov[i], cur.j, cur.k, cur.cost+1});
                box[cur.a][cur.b][cur.c][cur.d][cur.e][cur.f][cur.g][cur.h][cur.i+mov[i]][cur.j][cur.k]=1;
            }
            if(0<=cur.j+mov[i] && cur.j+mov[i]<n && !box[cur.a][cur.b][cur.c][cur.d][cur.e][cur.f][cur.g][cur.h][cur.i][cur.j+mov[i]][cur.k]) {
                qu.push({cur.a, cur.b, cur.c, cur.d, cur.e, cur.f, cur.g, cur.h, cur.i, cur.j+mov[i], cur.k, cur.cost+1});
                box[cur.a][cur.b][cur.c][cur.d][cur.e][cur.f][cur.g][cur.h][cur.i][cur.j+mov[i]][cur.k]=1;
            }
            if(0<=cur.k+mov[i] && cur.k+mov[i]<m && !box[cur.a][cur.b][cur.c][cur.d][cur.e][cur.f][cur.g][cur.h][cur.i][cur.j][cur.k+mov[i]]) {
                qu.push({cur.a, cur.b, cur.c, cur.d, cur.e, cur.f, cur.g, cur.h, cur.i, cur.j, cur.k+mov[i], cur.cost+1});
                box[cur.a][cur.b][cur.c][cur.d][cur.e][cur.f][cur.g][cur.h][cur.i][cur.j][cur.k+mov[i]]=1;
            }
        }
    }

    for(int a=0;a<w;a++) {
        for(int b=0;b<v;b++) {
            for(int c=0;c<u;c++) {
                for(int d=0;d<t;d++) {
                    for(int e=0;e<s;e++) {
                        for(int f=0;f<r;f++) {
                            for(int g=0;g<q;g++) {
                                for(int h=0;h<p;h++) {
                                    for(int i=0;i<o;i++) {
                                        for(int j=0;j<n;j++) {
                                            for(int k=0;k<m;k++) {
                                                if(!box[a][b][c][d][e][f][g][h][i][j][k]) {
                                                    cout << -1;
                                                    return 0;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    cout << maxCost;
}
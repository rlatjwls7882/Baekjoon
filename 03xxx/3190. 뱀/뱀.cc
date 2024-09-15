#include<bits/stdc++.h>
using namespace std;

bool apple[100][100] = {false, };
bool visiting[100][100] = {false, };
int moveX[4] = {0, 1, 0, -1};
int moveY[4] = {1, 0, -1, 0};

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, K; cin >> N >> K;
    while(K-->0) {
        int a, b; cin >> a >> b;
        apple[a-1][b-1]=true;
    }

    int L; cin >> L;
    vector<pair<int, char>> v;
    while(L-->0) {
        int a; char b; cin >> a >> b;
        v.push_back(make_pair(a, b));
    }

    queue<pair<int, int>> q;
    int idx=0, t=0, x=0, y=0, d=0, tailX=0, tailY=0;
    while(true) {
        visiting[tailX][tailY]=false;
        visiting[x][y]=true;

        q.push(make_pair(x, y));
        if(apple[x][y]) {
            apple[x][y]=false;
        } else {
            tailX = q.front().first;
            tailY = q.front().second;
            q.pop();
        }

        if(idx<v.size() && t==v[idx].first) {
            if(v[idx].second=='L') d = (d+3)%4;
            else d = (d+1)%4;
            idx++;
        }

        t++;
        x += moveX[d];
        y += moveY[d];
        if(x<0 || x>=N || y<0 || y>=N || visiting[x][y]) break;
    }
    cout << t;
}
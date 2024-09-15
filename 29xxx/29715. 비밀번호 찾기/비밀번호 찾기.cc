#include<bits/stdc++.h>
using namespace std;

int N, cnt;
bool visited[9], existNum[9], usedNum[9];

void dfs(int depth, int remainAnother) {
    if(depth==N) {
        cnt++;
        return;
    }
    if(visited[depth]) {
        dfs(depth+1, remainAnother);
        return;
    }

    for(int i=0;i<9;i++) {
        if(existNum[i] && !usedNum[i]) {
            usedNum[i]=true;
            dfs(depth+1, remainAnother);
            usedNum[i]=false;
        }
    }
    if(remainAnother>0) {
        for(int i=0;i<9;i++) {
            if(!existNum[i] && !usedNum[i]) {
                usedNum[i]=true;
                dfs(depth+1, remainAnother-1);
                usedNum[i]=false;
            }
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int M; cin >> N >> M;
    int X, Y; cin >> X >> Y;
    while(M-->0) {
        int a, b; cin >> a >> b;
        if(a!=0) {
            visited[a-1]=true;
            usedNum[b-1]=true;
        } else {
            existNum[b-1]=true;
        }
    }

    int guess=0;
    for(int i=0;i<9;i++) {
        if(usedNum[i] || existNum[i]) {
            guess++;
        }
    }
    dfs(0, max(0, N-guess));
    cout << cnt*X + (cnt-1)/3*Y;
}
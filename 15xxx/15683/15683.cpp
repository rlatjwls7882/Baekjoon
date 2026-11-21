#include<bits/stdc++.h>
using namespace std;

int m[8][8], cnt[8][8] = {0, };
int N, M, minArea=64;
vector<pair<int, int>> pos;

void upPlus(int depth) {
    for(int i=pos[depth].first-1;i>=0 && m[i][pos[depth].second]!=6;i--) {
        cnt[i][pos[depth].second]++;
    }
}
void upMinus(int depth) {
    for(int i=pos[depth].first-1;i>=0 && m[i][pos[depth].second]!=6;i--) {
        cnt[i][pos[depth].second]--;
    }
}
void rightPlus(int depth) {
    for(int i=pos[depth].second+1;i<M && m[pos[depth].first][i]!=6;i++) {
        cnt[pos[depth].first][i]++;
    }
}
void rightMinus(int depth) {
    for(int i=pos[depth].second+1;i<M && m[pos[depth].first][i]!=6;i++) {
        cnt[pos[depth].first][i]--;
    }
}
void leftPlus(int depth) {
    for(int i=pos[depth].second-1;i>=0 && m[pos[depth].first][i]!=6;i--) {
        cnt[pos[depth].first][i]++;
    }
}
void leftMinus(int depth) {
    for(int i=pos[depth].second-1;i>=0 && m[pos[depth].first][i]!=6;i--) {
        cnt[pos[depth].first][i]--;
    }
}
void downPlus(int depth) {
    for(int i=pos[depth].first+1;i<N && m[i][pos[depth].second]!=6;i++) {
        cnt[i][pos[depth].second]++;
    }
}
void downMinus(int depth) {
    for(int i=pos[depth].first+1;i<N && m[i][pos[depth].second]!=6;i++) {
        cnt[i][pos[depth].second]--;
    }
}
void dfs(int depth) {
    if(depth==pos.size()) {
        int area=0;
        for(int i=0;i<N;i++) {
            for(int j=0;j<M;j++) {
                if(m[i][j]==0 && cnt[i][j]==0) {
                    area++;
                }
            }
        }
        minArea = min(minArea, area);
        return;
    }

    if(m[pos[depth].first][pos[depth].second]==1) {
        // 오른쪽
        rightPlus(depth);
        dfs(depth+1);
        rightMinus(depth);

        // 왼쪽
        leftPlus(depth);
        dfs(depth+1);
        leftMinus(depth);

        // 위쪽
        upPlus(depth);
        dfs(depth+1);
        upMinus(depth);

        // 아래쪽
        downPlus(depth);
        dfs(depth+1);
        downMinus(depth);
    } else if(m[pos[depth].first][pos[depth].second]==2) {
        // 오른쪽 왼쪽
        rightPlus(depth);
        leftPlus(depth);
        dfs(depth+1);
        rightMinus(depth);
        leftMinus(depth);
        
        // 위쪽 아래쪽
        upPlus(depth);
        downPlus(depth);
        dfs(depth+1);
        upMinus(depth);
        downMinus(depth);
    } else if(m[pos[depth].first][pos[depth].second]==3) {
        // 위쪽 오른쪽
        upPlus(depth);
        rightPlus(depth);
        dfs(depth+1);
        upMinus(depth);
        rightMinus(depth);

        // 오른쪽 아래쪽
        rightPlus(depth);
        downPlus(depth);
        dfs(depth+1);
        rightMinus(depth);
        downMinus(depth);

        // 아래쪽 왼쪽
        downPlus(depth);
        leftPlus(depth);
        dfs(depth+1);
        downMinus(depth);
        leftMinus(depth);

        // 왼쪽 위쪽
        leftPlus(depth);
        upPlus(depth);
        dfs(depth+1);
        leftMinus(depth);
        upMinus(depth);
    } else if(m[pos[depth].first][pos[depth].second]==4) {
        // 왼쪽X
        upPlus(depth);
        rightPlus(depth);
        downPlus(depth);
        dfs(depth+1);
        upMinus(depth);
        rightMinus(depth);
        downMinus(depth);

        // 위쪽X
        rightPlus(depth);
        downPlus(depth);
        leftPlus(depth);
        dfs(depth+1);
        rightMinus(depth);
        downMinus(depth);
        leftMinus(depth);

        // 오른쪽X
        downPlus(depth);
        leftPlus(depth);
        upPlus(depth);
        dfs(depth+1);
        downMinus(depth);
        leftMinus(depth);
        upMinus(depth);

        // 아래쪽X
        leftPlus(depth);
        upPlus(depth);
        rightPlus(depth);
        dfs(depth+1);
        leftMinus(depth);
        upMinus(depth);
        rightMinus(depth);
    } else if(m[pos[depth].first][pos[depth].second]==5) {
        upPlus(depth);
        downPlus(depth);
        leftPlus(depth);
        rightPlus(depth);
        dfs(depth+1);
        upMinus(depth);
        downMinus(depth);
        leftMinus(depth);
        rightMinus(depth);
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> N >> M;
    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            cin >> m[i][j];
            if(m[i][j]!=0 && m[i][j]!=6) {
                pos.push_back(make_pair(i, j));
            }
        }
    }
    dfs(0);
    cout << minArea;
}
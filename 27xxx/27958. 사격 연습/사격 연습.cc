#include<bits/stdc++.h>
using namespace std;

int n, k;
int maxScore, attack[5];
vector<vector<pair<int, int>>> board(8); // {hp, score}
int dx[] = {1, -1, 0, 0};
int dy[] = {0, 0, 1, -1};

void back(int depth, int score) {
    if(depth==k) {
        maxScore = max(maxScore, score);
        return;
    }
    vector<vector<pair<int, int>>> rem = board;

    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            if(board[i][j].first) {
                if(board[i][j].first>=10) {
                    auto tmp = board[i][j];
                    board[i][j].first = 0;
                    back(depth+1, score + tmp.first);
                    board[i][j] = tmp;
                } else if(board[i][j].first<=attack[depth]) {
                    int tmp = board[i][j].second;
                    board[i][j].first = 0;
                    for(int k=0;k<4;k++) {
                        int nx = i+dx[k];
                        int ny = j+dy[k];
                        if(nx<0 || nx>=n || ny<0 || ny>=n || board[nx][ny].first) continue;
                        board[nx][ny] = {tmp/4, tmp/4};
                    }
                    back(depth+1, score + tmp);
                    board = rem;
                } else {
                    board[i][j].first -= attack[depth];
                    back(depth+1, score);
                    board[i][j].first += attack[depth];
                }
                break;
            }
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> k;
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            int score; cin >> score;
            board[i].push_back({score, score});
        }
    }
    for(int i=0;i<k;i++) cin >> attack[i];
    back(0, 0);
    cout << maxScore;
}
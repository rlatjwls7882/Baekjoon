#include<bits/stdc++.h>
using namespace std;

int dx[] = {-1, 1, 0, 0};
int dy[] = {0, 0, 1, -1};

struct shark {
    int s, d, z;
    bool operator<(const shark sh) const {
        return z > sh.z;
    }
};

vector<vector<shark>> board(10000);

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int R, C, M; cin >> R >> C >> M;
    while(M--) {
        int r, c, s, d, z; cin >> r >> c >> s >> d >> z;
        board[(r-1)*C+c-1].push_back({s, d-1, z});
    }

    int sum=0;
    for(int i=0;i<C;i++) {
        // 상어 잡기
        for(int j=0;j<R;j++) {
            if(!board[j*C+i].empty()) {
                sum += board[j*C+i].front().z;
                board[j*C+i] = {};
                break;
            }
        }

        // 상어 이동
        vector<vector<shark>> nextBoard(10000);
        for(int j=0;j<R;j++) {
            for(int k=0;k<C;k++) {
                if(board[j*C+k].empty()) continue;
                shark next = board[j*C+k].front();

                int nextJ = (j+next.s*dx[next.d]) % (2*(R-1));
                int nextK = (k+next.s*dy[next.d]) % (2*(C-1));
                while(nextJ<0 || nextJ>=R) {
                    if(nextJ<0) nextJ = -nextJ;
                    else nextJ = 2*(R-1)-nextJ;
                    if(next.d%2) next.d--;
                    else next.d++;
                }
                while(nextK<0 || nextK>=C) {
                    if(nextK<0) nextK = -nextK;
                    else nextK = 2*(C-1)-nextK;
                    if(next.d%2) next.d--;
                    else next.d++;
                }

                auto &nextPos = nextBoard[nextJ*C+nextK];
                nextPos.push_back(next);
                sort(nextPos.begin(), nextPos.end());
            }
        }
        board = nextBoard;
    }
    cout << sum;
}
#include<bits/stdc++.h>
using namespace std;
typedef pair<int, int> P;

int moveX[4] = {1, -1, 0, 0};
int moveY[4] = {0, 0, 1, -1};

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, L, R; cin >> N >> L >> R;

    int arr[N][N];
    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            cin >> arr[i][j];
        }
    }

    for(int t=0;;t++) {
        bool chk=true;
        int nextArr[N][N]; memcpy(&nextArr, &arr, sizeof(arr));
        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                bool visited[N*N] = {false, };
                queue<P> q; q.push(P(i, j));
                visited[i*N+j]=true;
                int cnt=1, sum=arr[i][j];
                while(!q.empty()) {
                    P cur = q.front(); q.pop();
                    for(int k=0;k<4;k++) {
                        P next = P(cur.first+moveX[k], cur.second+moveY[k]);
                        if(next.first<0 || next.first>=N || next.second<0 || next.second>=N || visited[next.first*N+next.second] || L>abs(arr[next.first][next.second]-arr[cur.first][cur.second]) || R<abs(arr[next.first][next.second]-arr[cur.first][cur.second])) continue;
                        cnt++;
                        sum += arr[next.first][next.second];
                        visited[next.first*N+next.second]=true;
                        q.push(next);
                    }
                }
                if(cnt>1) {
                    chk=false;
                    for(int k=0;k<N;k++) {
                        for(int l=0;l<N;l++) {
                            if(visited[k*N+l]) {
                                nextArr[k][l] = sum/cnt;
                            }
                        }
                    }
                }
            }
        }
        memcpy(&arr, &nextArr, sizeof(arr));
        if(chk) {
            cout << t;
            return 0;
        }
    }
}
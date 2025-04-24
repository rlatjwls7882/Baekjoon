#include<bits/stdc++.h>
using namespace std;

const int INF = 0x3f3f3f3f;
const int MAX = 102;
const int S = MAX-2;
const int E = MAX-1;

int n, res[50][50], f[MAX][MAX], c[MAX][MAX], prv[MAX];
vector<vector<int>> conn(MAX);

void flow(int maxFlow) {
    memset(f, 0, sizeof f);
    for(int i=0;i<n;i++) {
        for(int j=n;j<2*n;j++) {
            c[i][j] = maxFlow;
        }
    }

    while(true) {
        memset(prv, -1, sizeof prv);
        queue<int> q; q.push(S);
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

        int flow=INF;
        for(int i=E;i!=S;i=prv[i]) {
            flow = min(flow, c[prv[i]][i]-f[prv[i]][i]);
        }
        for(int i=E;i!=S;i=prv[i]) {
            f[prv[i]][i] += flow;
            f[i][prv[i]] -= flow;
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n;

    // 행들을 S에 부착
    for(int i=0;i<n;i++) {
        cin >> c[S][i];
        conn[i].push_back(S);
        conn[S].push_back(i);
    }

    // 열들을 E에 부착
    for(int i=n;i<2*n;i++) {
        cin >> c[i][E];
        conn[i].push_back(E);
        conn[E].push_back(i);
    }

    // 행과 열 사이의 연결
    for(int i=0;i<n;i++) {
        for(int j=n;j<2*n;j++) {
            conn[i].push_back(j);
            conn[j].push_back(i);
        }
    }

    int left=0, right=10000;
    while(left<right) {
        int mid = (left+right)/2;
        flow(mid);

        // chk==true : 지금 mid로 행렬을 만들 수 있음 (mid가 아무리 높아봐야 최대값)
        // chk==false : 지금 mid로 행렬을 만들 수 없음 (최댓값이 mid보단 커야함)
        bool chk=true;
        for(int i=n;i<2*n;i++) {
            if(c[i][E]!=f[i][E]) {
                chk=false;
                break;
            }
        }

        if(chk) right = mid;
        else left = mid+1;
    }

    // left, right : 행렬에서 등장하는 최종 최댓값
    flow(left);
    cout << left << '\n';

    // f[i][j] : i번 행에서 j-n번 열 사이의 플로우 (i번 행과 j-n번 열이 만나는 지점)
    for(int i=0;i<n;i++) {
        for(int j=n;j<2*n;j++) {
            cout << f[i][j] << ' ';
        }
        cout << '\n';
    }
}
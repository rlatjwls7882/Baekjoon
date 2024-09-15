#include <bits/stdc++.h>
using namespace std;

bool notSolve[100][10] = {false, };

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;

    int remain[N];
    int chk[M] = {0, };
    for(int i=0;i<N;i++) {
        int cnt; cin >> cnt;
        if(cnt==M || cnt==0) {
            cout << "NO";
            return 0;
        }

        for(int j=0;j<M;j++) {
            int tmp; cin >> tmp;
            if(tmp==1) {
                chk[j]++;
                cnt--;
            } else if(tmp==-1) {
                notSolve[i][j]=true;
            }
        }
        remain[i]=cnt;
    }

    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            if(notSolve[i][j] && !chk[j] && remain[i]) {
                chk[j]++;
                notSolve[i][j]=false;
                remain[i]--;
            }
        }

        if(remain[i]) {
            for(int j=0;j<M;j++) {
                if(notSolve[i][j]) {
                    notSolve[i][j]=false;
                    remain[i]--;
                    chk[j]++;
                }
            }
        }
    }

    for(int i=0;i<M;i++) {
        if(!chk[i]) {
            cout << "NO";
            return 0;
        }
    }
    cout << "YES";
}
#include <bits/stdc++.h>
using namespace std;

struct Score {
    int id, solve=0, cnt=0;

    bool operator<(Score a) const {
        if(this->solve==a.solve) return this->cnt<a.cnt;
        return this->solve>a.solve;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int K; cin >> K;

    for(int i=1;i<=K;i++) {
        int M, N, P; cin >> M >> N >> P;
        vector<vector<int>> v = vector<vector<int>>(P, vector<int>(M));

        Score scores[P];
        for(int j=0;j<P;j++) {
            scores[j].id=j+1;
        }

        while(N-->0) {
            int p, t, j; char m; cin >> p >> m >> t >> j;
            if(v[p-1][m-'A']!=-1) {
                if(j==1) {
                    scores[p-1].solve++;
                    scores[p-1].cnt += t+v[p-1][m-'A']*20;
                    v[p-1][m-'A']=-1;
                } else {
                    v[p-1][m-'A']++;
                }
            }
        }
        sort(scores, scores+P);

        cout << "Data Set " << i << ":\n";
        for(int j=0;j<P;j++) {
            cout << scores[j].id << ' ' << scores[j].solve << ' ' << scores[j].cnt << '\n';
        }
        cout << '\n';
    }
}
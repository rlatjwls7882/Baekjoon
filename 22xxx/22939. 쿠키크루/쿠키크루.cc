#include<bits/stdc++.h>
using namespace std;
typedef pair<int, int> P;

P H, K;
vector<vector<P>> JCBW = vector<vector<P>>(4);

int calcTime(int cnt, int i, int j, int k) {
    return abs(H.first-JCBW[cnt][i].first)+abs(JCBW[cnt][i].first-JCBW[cnt][j].first)+abs(JCBW[cnt][j].first-JCBW[cnt][k].first)+abs(JCBW[cnt][k].first-K.first)+abs(H.second-JCBW[cnt][i].second)+abs(JCBW[cnt][i].second-JCBW[cnt][j].second)+abs(JCBW[cnt][j].second-JCBW[cnt][k].second)+abs(JCBW[cnt][k].second-K.second);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    string m[N];
    for(int i=0;i<N;i++) {
        cin >> m[i];
    }

    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            if(m[i][j]=='H') {
                H = P(i, j);
            } else if(m[i][j]=='#') {
                K = P(i, j);
            } else if(m[i][j]=='J') {
                JCBW[0].push_back(P(i, j));
            } else if(m[i][j]=='C') {
                JCBW[1].push_back(P(i, j));
            } else if(m[i][j]=='B') {
                JCBW[2].push_back(P(i, j));
            } else if(m[i][j]=='W') {
                JCBW[3].push_back(P(i, j));
            }
        }
    }

    int cnt[4] = {10000000, 10000000, 10000000, 10000000};
    for(int cntNum=0;cntNum<4;cntNum++) {
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                for(int k=0;k<3;k++) {
                    if(i!=j && i!=k && j!=k) {
                        cnt[cntNum] = min(cnt[cntNum], calcTime(cntNum, i, j, k));
                    }
                }
            }
        }
    }

    if(cnt[0]<=cnt[1] && cnt[0]<=cnt[2] && cnt[0]<=cnt[3]) cout << "Assassin";
    else if(cnt[1]<=cnt[2] && cnt[1]<=cnt[3]) cout << "Healer";
    else if(cnt[2]<=cnt[3]) cout << "Mage";
    else cout << "Tanker";
}
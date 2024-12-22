#include<bits/stdc++.h>
using namespace std;

bool chk[2000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N; string s; cin >> N >> s;
    vector<int> idx;
    for(int i=0;i<N;i++) if(s[i]=='#') idx.push_back(i);

    int minCnt = N;
    for(int d=1;d<N;d++) {
        memset(chk, false, sizeof(chk));
        int curCnt=0;
        for(int i=0;i<idx.size();i++) {
            int cur = idx[i];
            if(chk[cur]) continue;
            curCnt++;
            while(cur<N && s[cur]=='#') {
                chk[cur] = true;
                cur += d;
            }
        }
        minCnt = min(minCnt, curCnt);
    }
    cout << minCnt;
}
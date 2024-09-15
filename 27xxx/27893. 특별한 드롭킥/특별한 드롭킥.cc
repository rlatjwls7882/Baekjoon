#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; string s; cin >> N >> M >> s;

    vector<int> gap;
    int blankCnt=0;
    int startGap=0;
    int lastBlank=0;
    for(int i=0;i<N;i++) {
        if(s[i]=='X') {
            if(i!=lastBlank && lastBlank!=-1) {
                if(lastBlank==0) startGap = i-lastBlank;
                else gap.push_back(i-lastBlank);
            }
            lastBlank=-1;
        } else {
            if(lastBlank==-1) lastBlank=i;
            blankCnt++;
        }
    }
    int lastGap=0;
    if(lastBlank!=-1) lastGap = N-lastBlank;

    int garbageCnt = gap.size()+1;
    if(lastGap==N) garbageCnt=0;
    sort(gap.begin(), gap.end());
    for(int i=0;i<gap.size();i++) {
        if(M<gap[i]) {
            blankCnt -= M;
            M=0;
            break;
        } else {
            M -= gap[i];
            blankCnt -= gap[i];
            garbageCnt--;
        }
    }

    if(M>0 && lastGap!=N || M>=2) {
        int tmp = min(startGap, M);
        blankCnt -= tmp;
        M -= tmp;

        tmp = min(lastGap, M);
        blankCnt -= tmp;
        M -= tmp;

        if(gap.empty()) garbageCnt=1;
    }
    cout << blankCnt + garbageCnt*2;
}
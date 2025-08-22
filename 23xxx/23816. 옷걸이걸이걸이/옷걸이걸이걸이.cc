#include<bits/stdc++.h>
using namespace std;

const int MAX = 10'001;

int maxScore[MAX], spotCnt[MAX];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;

    fill(spotCnt, spotCnt+MAX, n);
    memset(maxScore, -1, sizeof maxScore);
    maxScore[0]=spotCnt[0]=0;

    for(int i=16;i>=2;i/=2) {
        int cur = i-1; // 옷거리 개수
        int score = i/2; // 획득 점수
        if(i==16) score=0;

        for(int rep=0;rep<n;rep++) {
            for(int j=m-cur;j>=0;j--) {
                if(maxScore[j]!=-1 && maxScore[j+cur]<maxScore[j]+score && spotCnt[j]<n) {
                    maxScore[j+cur] = maxScore[j]+score;
                    spotCnt[j+cur] = spotCnt[j]+1;
                }
            }
        }
    }
    cout << maxScore[m];
}
#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    long long N, M; cin >> N >> M;

    long long cnt=1, curX=1, curY=1;
    if(curX+2<=N && curY+1<=M) {
        curX+=2;
        curY++;
        cnt++;
    }
    if(curX-2>=1 && curY+1<=M) {
        curX-=2;
        curY++;
        cnt++;
    }
    if(curX+1<=N && curY+2<=M) {
        curX++;
        curY+=2;
        cnt++;
    }
    if(curX-1>=1 && curY+2<=M) {
        curX--;
        curY+=2;
        cnt++;
    }

    long long repeatCnt=0;
    if((curX+2<=N || curX-2>=1) && curY+1<=M) {
        long long curCnt = (M-curY)/2;
        curY += curCnt*2;
        repeatCnt += curCnt*2;
    }
    if((curX+1<=N || curX-1>=1) && curY+2<=M) {
        long long curCnt = (M-curY)/4;
        curY += curCnt*4;
        repeatCnt += curCnt*2;
    }
    if(curX+2<=N && curY+1<=M) {
        long long curCnt = min((N-curX)/2, M-curY);
        curX += curCnt*2;
        curY += curCnt;
        repeatCnt += curCnt;
    }
    if(curX-2>=1 && curY+1<=M) {
        long long curCnt = min((curX-1)/2, M-curY);
        curX -= curCnt*2;
        curY += curCnt;
        repeatCnt += curCnt;
    }
    if(curX+1<=N && curY+2<=M) {
        long long curCnt = min(N-curX, (M-curY)/2);
        curX += curCnt;
        curY += curCnt*2;
        repeatCnt += curCnt;
    }
    if(curX-1>=1 && curY+2<=M) {
        long long curCnt = min(curX-1, (M-curY)/2);
        curX -= curCnt;
        curY += curCnt*2;
        repeatCnt += curCnt;
    }
    if(cnt==5) cout << cnt+repeatCnt;
    else cout << min(cnt+repeatCnt, 4LL);
}
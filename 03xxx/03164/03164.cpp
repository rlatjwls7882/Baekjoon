#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    long long x1, y1, x2, y2; cin >> x1 >> y1 >> x2 >> y2;

    // 색칠된 칸을 왼쪽 아래 꼭짓점으로 하는 정사각형 만들기
    long long squareStart=-1, squareEnd=min(x2, y2);
    for(long long i=max(x1, y1);i<min(x2, y2);i++) {
        if(i%2==1) {
            squareStart=i;
            break;
        }
    }

    if(squareStart==-1) {
        if(x2<y2) cout << (x2-x1)*((y2-y1+1)/2);
        else cout << ((x2-x1+1)/2)*(y2-y1);
    } else {
        if((squareEnd-squareStart)%2==0) squareEnd--;
        long long squareSize = (squareEnd-squareStart+1)/2;
        // squareSize*(2*squareSize-1) -> 정사각형 내에 색칠된 크기
        // (squareStart-x1)*((squareEnd-squareStart+1)/2) -> 정사각형 왼쪽에 색칠된 크기
        // (squareStart-y1)*((squareEnd-squareStart+1)/2) -> 정사각형 아래에 색칠된 크기
        // (x2-squareEnd)/2*(y2-y1) -> 정사각형 오른쪽에 색칠된 크기
        // (y2-squareEnd)/2*(x2-x1) -> 정사각형 위쪽에 색칠된 크기
        cout << squareSize*(2*squareSize-1) + (squareStart-x1)*((squareEnd-squareStart+1)/2) + (squareStart-y1)*((squareEnd-squareStart+1)/2) + (x2-squareEnd)/2*(y2-y1) + (y2-squareEnd)/2*(x2-x1);
    }
}
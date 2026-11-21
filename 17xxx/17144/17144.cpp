#include<bits/stdc++.h>
using namespace std;

int moveX[4] = {0, 0, 1, -1};
int moveY[4] = {1, -1, 0, 0};

struct Pos {
    int x, y;
    Pos(int x, int y) {
        this->x=x;
        this->y=y;
    }
};

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int R, C, T; cin >> R >> C >> T;
    int m[R*C];
    Pos upper(-1, -1), lower(-1, -1);
    for(int i=0;i<R*C;i++) {
        cin >> m[i];
        if(m[i]==-1 && upper.x==-1) {
            upper.x=i/C;
            upper.y=0;
            lower.x=i/C+1;
            lower.y=0;
        }
    }

    while(T-->0) {
        int nextM[R*C] = {0, }; memcpy(&nextM, &m, sizeof(m));

        for(int i=0;i<R*C;i++) {
            if(m[i]!=0 && m[i]!=-1) {
                int move = m[i]/5;
                for(int j=0;j<4;j++) {
                    Pos next = Pos(i/C+moveX[j], i%C+moveY[j]);
                    if(next.x<0 || next.x>=R || next.y<0 || next.y>=C || m[next.x*C+next.y]==-1) continue;
                    nextM[next.x*C+next.y]+=move;
                    nextM[i]-=move;
                }
            }
        }

        for(int i=upper.x-2;i>=0;i--) {
            nextM[(i+1)*C]=nextM[i*C];
        }
        for(int i=1;i<C;i++) {
            nextM[i-1]=nextM[i];
        }
        for(int i=1;i<=upper.x;i++) {
            nextM[i*C-1]=nextM[(i+1)*C-1];
        }
        for(int i=C-1;i>1;i--) {
            nextM[upper.x*C+i]=nextM[upper.x*C+i-1];
        }
        nextM[upper.x*C+1]=0;

        for(int i=lower.x+2;i<R;i++) {
            nextM[(i-1)*C]=nextM[i*C];
        }
        for(int i=0;i<C-1;i++) {
            nextM[(R-1)*C+i]=nextM[(R-1)*C+i+1];
        }
        for(int i=R-1;i>lower.x;i--) {
            nextM[(i+1)*C-1]=nextM[i*C-1];
        }
        for(int i=C-1;i>1;i--) {
            nextM[lower.x*C+i]=nextM[lower.x*C+i-1];
        }
        nextM[lower.x*C+1]=0;

        memcpy(&m, &nextM, sizeof(m));
    }

    int sum=0;
    for(int i=0;i<R*C;i++) {
        if(m[i]>0) {
            sum += m[i];
        }
    }
    cout << sum;
}
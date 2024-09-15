#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int L, N, T; cin >> L >> N >> T;

    bool leftMovingBall[L+1] = {false, };
    bool rightMovingBall[L+1] = {false, };
    while(N-->0) {
        int a; char b; cin >> a >> b;
        if(b=='R') rightMovingBall[a]=true;
        else leftMovingBall[a]=true;
    }

    int cnt=0;
    while(T-->0) {
        for(int i=1;i<=L;i++) {
            if(leftMovingBall[i]) {
                leftMovingBall[i-1]=true;
                leftMovingBall[i]=false;
            }
        }
        for(int i=L-1;i>=0;i--) {
            if(rightMovingBall[i]) {
                rightMovingBall[i+1]=true;
                rightMovingBall[i]=false;
            }
        }

        if(leftMovingBall[0]) {
            rightMovingBall[0]=true;
            leftMovingBall[0]=false;
        }
        if(rightMovingBall[L]) {
            leftMovingBall[L]=true;
            rightMovingBall[L]=false;
        }

        for(int i=1;i<L;i++) {
            if(leftMovingBall[i] && rightMovingBall[i]) {
                cnt++;
            }
        }
    }
    cout << cnt;
}
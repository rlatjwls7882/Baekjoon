#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, K; cin >> N >> K;
    int A[2*N];
    for(int i=0;i<2*N;i++) {
        cin >> A[i];
    }

    bool robot[2*N] = {false, };
    int cnt=0;
    while(K>0) {
        // 컨베이어벨트 이동
        for(int i=N-2;i>=0;i--) {
            if(robot[i]) {
                robot[i+1]=true;
                robot[i]=false;
            }
        }
        robot[N-1]=false;
        int tmp=A[2*N-1];
        for(int i=2*N-1;i>0;i--) {
            A[i]=A[i-1];
        }
        A[0]=tmp;

        // 로봇 이동
        for(int i=N-2;i>=0;i--) {
            if(!robot[i+1] && robot[i] && A[i+1]) {
                if(--A[i+1]==0) K--;
                robot[i+1]=true;
                robot[i]=false;
            }
        }

        // 로봇 올리기
        if(A[0]) {
            robot[0]=true;
            if(--A[0]==0) K--;
        }
        cnt++;
    }
    cout << cnt;
}
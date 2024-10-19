#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    // 추 입력
    int N; cin >> N;
    int chu[N];
    for(int i=0;i<N;i++) cin >> chu[i];

    // 가능한 종류 -까지 전부 확인
    bool possible[80001] = {false, }; // -40000, -39999, ... , 40000
    possible[40000]=true;
    for(int i=0;i<N;i++) {
        bool nextPossible[80001]; memcpy(nextPossible, possible, sizeof(possible));
        for(int j=0;j<=80000;j++) {
            if(possible[j]) {
                nextPossible[j+chu[i]]=true;
                nextPossible[j-chu[i]]=true;
            }
        }
        memcpy(possible, nextPossible, sizeof(possible));
    }

    // 출력
    int M; cin >> M;
    while(M-->0) {
        int w; cin >> w;
        if(possible[40000+w]) cout << "Y ";
        else cout << "N ";
    }
}
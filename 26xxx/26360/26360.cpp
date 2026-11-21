#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int X; cin >> X;

    int score=0;
    int next; cin >> next;
    if(next) { // 농구공이 바스켓을 친 경우
        score += X;
        cin >> next;
        if(next) { // 추가 기회 1번
            cin >> next;
            score += next;
        }
    } else { // 농구공이 바스켓을 치지 못한 경우
        cin >> next;
        if(next) { // 추가 기회 X번
            for(int i=0;i<X;i++) {
                cin >> next;
                score += next;
            }
        }
    }
    cout << score;
}
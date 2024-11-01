#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, T; cin >> N >> T;

    // 시작지점과 도착지점 체크
    long long cnt[100002] = {0, };
    while(N-->0) {
        int K; cin >> K;
        while(K-->0) {
            int S, E; cin >> S >> E;
            cnt[S]++;
            cnt[E]--;
        }
    }

    // 스위핑
    for(int i=0;i<=100000;i++) cnt[i+1] += cnt[i];

    // 누적합
    for(int i=0;i<=100000;i++) cnt[i+1] += cnt[i];

    // 최대 시간 계산
    long long maxCnt=cnt[T-1], maxStart=0;
    for(int i=T;i<=100000;i++) {
        if(maxCnt < cnt[i]-cnt[i-T]) {
            maxCnt = cnt[i]-cnt[i-T];
            maxStart=i-T+1;
        }
    }
    cout << maxStart << ' ' << maxStart+T;
}
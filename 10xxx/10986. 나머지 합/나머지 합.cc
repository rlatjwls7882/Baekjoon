#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;

    // M으로 나눈 나머지가 등장한 횟수 저장
    long long cnt[M] = {0, };
    long long preSum=0;
    while(N-->0) {
        int A; cin >> A;
        preSum = (preSum+A)%M;
        cnt[preSum]++;
    }

    // 연속된 부분 구간의 합이 M으로 나누어떨어지는 횟수 계산
    long long total = cnt[0];
    for(int i=0;i<M;i++) total += cnt[i]*(cnt[i]-1)/2;
    cout << total;
}
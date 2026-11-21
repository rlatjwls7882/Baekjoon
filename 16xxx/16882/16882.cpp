#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;

    int cnt[100001] = {0, };
    while(n-->0) {
        int A; cin >> A;
        cnt[A]++;
    }

    // koosaga가 이기는 경우:
    // 제일 큰 수가 홀수개인 경우
    // 제일 큰 수가 짝수개이고 그다음으로 큰 수가 홀수개인 경우
    // ...
    // -> 어떠한 수가 하나라도 홀수개인 경우
    for(int i=100000;i>=1;i--) {
        if(cnt[i]%2==1) {
            cout << "koosaga";
            return 0;
        }
    }
    cout << "cubelover";
}

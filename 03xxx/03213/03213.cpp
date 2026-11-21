#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    int cnt[3] = {0, };
    while(N-->0) {
        string s; cin >> s;
        if(s[2]=='2') cnt[1]++;
        else cnt[s[0]-'1']++;
    }

    int cnt0_cnt2 = min(cnt[0], cnt[2]);
    cnt[0] -= cnt0_cnt2; cnt[2] -= cnt0_cnt2;

    int cnt0_cnt0_cnt1 = min(cnt[0]/2, cnt[1]);
    cnt[0] -= cnt0_cnt0_cnt1*2; cnt[1] -= cnt0_cnt0_cnt1;

    int cnt0_cnt1 = min(cnt[0], cnt[1]);
    cnt[0] -= cnt0_cnt1; cnt[1] -=cnt0_cnt1;

    int cnt1_cnt1 = cnt[1]/2;
    cnt[1] -= cnt1_cnt1*2;

    cout << cnt0_cnt2 + cnt0_cnt0_cnt1 + cnt0_cnt1 + cnt1_cnt1 + cnt[0] + cnt[1] + cnt[2];
}
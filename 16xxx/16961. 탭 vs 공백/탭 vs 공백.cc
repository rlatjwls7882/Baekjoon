#include<bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    pair<int, int> pre[368]; fill(pre, pre+368, pair<int, int>(0, 0));
    int longest=0;
    for(int i=0;i<N;i++) {
        char c; int s, e; cin >> c >> s >> e; s-=1; e-=1;
        longest = max(longest, e-s+1);

        if(c=='T') {
            pre[s].first++;
            pre[e+1].first--;
        } else {
            pre[s].second++;
            pre[e+1].second--;
        }
    }

    int cnt1=0, maxP=0, happy=0, happyP=0;
    for(int i=0;i<366;i++) {
        pre[i+1].first+=pre[i].first;
        pre[i+1].second+=pre[i].second;
        if(pre[i].first>0 || pre[i].second>0) cnt1++;
        maxP = max(maxP, pre[i].first+pre[i].second);
        if(pre[i].first>0 && pre[i].second>0 && pre[i].first==pre[i].second) {
            happy++;
            happyP = max(happyP, pre[i].first+pre[i].second);
        }
    }
    cout << cnt1 << '\n';
    cout << maxP << '\n';
    cout << happy << '\n';
    cout << happyP << '\n';
    cout << longest;
}
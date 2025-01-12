#include<bits/stdc++.h>
using namespace std;

int type[3001];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N, d, k, c; cin >> N >> d >> k >> c;
    vector<int> list(N);
    for(int i=0;i<N;i++) cin >> list[i];

    int cnt=1;
    type[c]=1;
    for(int i=0;i<k;i++) {
        if(++type[list[i]]==1) cnt++;
    }

    int maxCnt=cnt, left=0, right=k;
    while(left<N) {
        if(--type[list[(left++)%N]]==0) cnt--;
        if(++type[list[(right++)%N]]==1) cnt++;
        maxCnt = max(maxCnt, cnt);
    }
    cout << maxCnt;
}
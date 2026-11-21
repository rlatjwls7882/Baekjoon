#include<bits/stdc++.h>
using namespace std;

bool ang[360], use[360];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    while(n--) {
        int x; cin >> x;
        ang[x]=true;
    }

    int maxCnt=0;
    for(int diff=1;diff<360;diff++) {
        int cnt=0;
        memset(use, 0, sizeof use);
        for(int start=0;start<360;start++) {
            if(use[start]) continue;

            int cur=start, len=0;
            vector<int> lens;
            do {
                if(ang[cur]) len++;
                else {
                    lens.push_back(len);
                    len=0;
                }
                use[cur]=true;
                cur = (cur+diff)%360;
            } while(cur!=start);
            if(lens.empty()) lens.push_back(len);
            else lens[0] += len;

            for(int e : lens) cnt += e/2*2;
        }
        maxCnt = max(maxCnt, cnt);
    }
    cout << maxCnt;
}
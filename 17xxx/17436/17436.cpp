#include<bits/stdc++.h>
using namespace std;
typedef long long ll;

ll N, M;
ll num[10];

ll dfs(int depth, int goal, int start, ll val) {
    if(depth==goal) {
        return M/val;
    }

    ll sum=0;
    for(int i=start;i<N;i++) {
        sum += dfs(depth+1, goal, i+1, val*num[i]);
    }
    return sum;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> N >> M;
    for(int i=0;i<N;i++) {
        cin >> num[i];
    }

    ll totalCnt=0;
    for(int depth=1;depth<=N;depth++) {
        ll cnt = dfs(0, depth, 0, 1);
        if(depth%2==1) {
            totalCnt += cnt;
        } else {
            totalCnt -= cnt;
        }
    }
    cout << totalCnt;
}
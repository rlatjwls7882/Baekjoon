#include<bits/stdc++.h>
using namespace std;

vector<int> to;
int N, K, maxCnt=0;

void dfs(vector<int> cur, int depth) {
    int cnt=0;
    for(int i=0;i<N;i++) {
        if(cur[i] == to[i]) cnt++;
    }
    maxCnt = max(maxCnt, cnt);
    if(depth==K) return;
    for(int i=0;i<N;i++) {
        if(cur[i] != to[i]) {
            vector<int> tmp(cur);
            for(int j=N-1;j>i;j--) {
                tmp[j] = tmp[j-1];
            }
            tmp[i]=0;
            dfs(tmp, depth+1);

            tmp = cur;
            for(int j=i;j<N-1;j++) {
                tmp[j] = tmp[j+1];
            }
            tmp[N-1]=0;
            dfs(tmp, depth+1);
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> N >> K;
    vector<int> arr;
    for(int i=0;i<N;i++) {
        int tmp; cin >> tmp;
        arr.push_back(tmp);
    }
    for(int i=0;i<N;i++) {
        int tmp; cin >> tmp;
        to.push_back(tmp);
    }
    dfs(arr, 0);
    cout << maxCnt;
}
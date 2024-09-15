#include<bits/stdc++.h>
using namespace std;

int N, M, maxSize=1;
int arr[101] = {0, };

void dfs(int depth, int curSize, int pos) {
    maxSize = max(maxSize, curSize);
    if(depth==M) return;

    if(pos+1<=N) dfs(depth+1, curSize+arr[pos+1], pos+1);
    if(pos+2<=N) dfs(depth+1, curSize/2+arr[pos+2], pos+2);
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> N >> M;
    for(int i=1;i<=N;i++) {
        cin >> arr[i];
    }

    dfs(0, 1, 0);
    cout << maxSize;
}
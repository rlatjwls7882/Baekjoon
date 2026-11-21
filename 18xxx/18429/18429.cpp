#include<bits/stdc++.h>
using namespace std;

int N, K, cnt=0;
int arr[8];
bool visited[8] = {false, };

void dfs(int sum, int depth) {
    if(sum-depth*K<500) return;
    if(depth==N) {
        cnt++;
        return;
    }
    for(int i=0;i<N;i++) {
        if(!visited[i]) {
            visited[i]=true;
            dfs(sum+arr[i], depth+1);
            visited[i]=false;
        }
    }
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> N >> K;
    for(int i=0;i<N;i++) {
        cin >> arr[i];
    }

    dfs(500, 0);
    cout << cnt;
}
#include<bits/stdc++.h>
using namespace std;

int N;
int maxSum=0;
int arr[8];
int newArr[8];
bool visited[8] = {false, };

void dfs(int depth) {
    if(depth==N) {
        int sum=0;
        for(int i=1;i<N;i++) {
            sum += abs(newArr[i]-newArr[i-1]);
        }
        maxSum = max(maxSum, sum);
    }

    for(int i=0;i<N;i++) {
        if(!visited[i]) {
            visited[i]=true;
            newArr[depth]=arr[i];
            dfs(depth+1);
            visited[i]=false;
        }
    }
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> N;
    for(int i=0;i<N;i++) {
        cin >> arr[i];
    }

    dfs(0);
    cout << maxSum;
}
#include<bits/stdc++.h>
using namespace std;

int maxSum;
bool visited[11];
int ability[11][11];

void back(int depth, int sum) {
    if(depth==11) {
        maxSum = max(maxSum, sum);
    }
    for(int i=0;i<11;i++) {
        if(!visited[i] && ability[depth][i]) {
            visited[i]=true;
            back(depth+1, sum+ability[depth][i]);
            visited[i]=false;
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int C; cin >> C;
    while(C-->0) {
        maxSum=0;
        for(int i=0;i<11;i++) {
            for(int j=0;j<11;j++) {
                cin >> ability[i][j];
            }
        }
        back(0, 0);
        cout << maxSum << '\n';
    }
}
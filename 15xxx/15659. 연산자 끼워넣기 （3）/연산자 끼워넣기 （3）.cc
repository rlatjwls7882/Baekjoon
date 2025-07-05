#include<bits/stdc++.h>
using namespace std;

int MAX = -0x3f3f3f3f;
int MIN = 0x3f3f3f3f;
int n, a[11], opt[4];

int visited[11];

void dfs(int depth) {
    if(depth==n) {
        int sum=0, last=a[0];
        for(int i=1;i<n;i++) {
            if(visited[i]>=3) {
                if(visited[i]==3) last *= a[i];
                else last /= a[i];
            } else {
                sum += last;
                if(visited[i]==1) last = a[i];
                else last = -a[i];
            }
        }
        sum += last;

        MAX = max(MAX, sum);
        MIN = min(MIN, sum);
        return;
    }
    for(int i=0;i<4;i++) {
        if(opt[i]) {
            opt[i]--;
            visited[depth]=i+1;
            dfs(depth+1);
            opt[i]++;
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n;
    for(int i=0;i<n;i++) cin >> a[i];
    for(int i=0;i<4;i++) cin >> opt[i];
    dfs(1);
    cout << MAX << '\n' << MIN;
}
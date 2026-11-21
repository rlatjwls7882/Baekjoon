#include<bits/stdc++.h>
using namespace std;

int N, M, res[8];

void back(int depth, int cur) {
    if(depth==M) {
        for(int i=0;i<M;i++) cout << res[i] << ' ';
        cout << '\n';
        return;
    }
    for(int i=cur;i<N;i++) {
        res[depth]=i+1;
        back(depth+1, i);
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> N >> M;
    back(0, 0);
}
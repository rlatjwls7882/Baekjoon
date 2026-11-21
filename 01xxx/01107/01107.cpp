#include<bits/stdc++.h>
using namespace std;

int N, length, diff;
bool chk[10] = {false, };

void dfs(int depth, int val) {
    if(depth>0) {
        diff = min(diff, abs(N-val)+depth);
    }
    if(depth>=length+1) {
        return;
    }
    
    for(int i=0;i<=9;i++) {
        if(!chk[i]) {
            dfs(depth+1, val*10+i);
        }
    }
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> N;
    length = max(1, (int)(log10(N)+1)); // N의 값으로 0이 들어올 수 있음
    diff = abs(N-100);

    int M; cin >> M;
    while(M-->0) {
        int tmp; cin >> tmp;
        chk[tmp]=true;
    }

    dfs(0, 0);
    cout << diff;
}
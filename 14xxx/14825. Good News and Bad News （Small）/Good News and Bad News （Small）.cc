#include<bits/stdc++.h>
using namespace std;

int F, P;
bool finish;
int A[12], B[12], sum[12], cases[12];

void dfs(int depth) {
    if(depth==P) {
        for(int i=0;i<F;i++) {
            if(sum[i]!=0) return;
        }
        finish=true;
        return;
    }
    for(int i=-F;i<=F;i++) {
        if(i==0) continue;
        if(finish) return;
        sum[A[depth]-1]+=i;
        sum[B[depth]-1]-=i;
        cases[depth]=i;
        dfs(depth+1);
        sum[A[depth]-1]-=i;
        sum[B[depth]-1]+=i;
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int T; cin >> T;
    for(int i=1;i<=T;i++) {
        cin >> F >> P;
        for(int j=0;j<P;j++) cin >> A[j] >> B[j];

        finish=false;
        dfs(0);
        cout << "Case #" << i << ": ";
        if(finish) {
            for(int j=0;j<P;j++) cout << cases[j] << ' ';
            cout << '\n';
        } else {
            cout << "IMPOSSIBLE\n";
        }
    }
}
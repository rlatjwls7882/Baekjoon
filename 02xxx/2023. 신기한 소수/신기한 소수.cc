#include<bits/stdc++.h>
using namespace std;

int N;
bool chk(int val) {
    if(val==1) return false;
    for(int i=2;i*i<=val;i++) {
        if(val%i==0) {
            return false;
        }
    }
    return true;
}

void dfs(int val, int depth) {
    for(int i=0;i<=9;i++) {
        int nextVal = val*10+i;
        if(nextVal==val) continue;
        if(chk(nextVal)) {
            if(depth==N-1) {
                cout << nextVal << '\n';
            } else {
                dfs(nextVal, depth+1);
            }
        }
    }
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> N;
    dfs(0, 0);
}
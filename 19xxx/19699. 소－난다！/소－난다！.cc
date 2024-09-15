#include <bits/stdc++.h>
#define MAX 10000
using namespace std;

int N, M, cnt=0;
int H[11] = {0, };
bool notPrime[MAX] = {true, true, false, };
set<int> s;

void dfs(int cur, int depth, int sum) {
    if(depth==M) {
        if(!notPrime[sum]) {
            s.insert(sum);
        }
        return;
    }

    for(int i=cur+1;i<N;i++) {
        dfs(i, depth+1, sum+H[i]);
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> N >> M;
    for(int i=0;i<N;i++) {
        cin >> H[i];
    }

    for(int i=2;i*i<=MAX;i++) {
        if(!notPrime[i]) {
            for(int j=i*i;j<=MAX;j+=i) {
                notPrime[j]=true;
            }
        }
    }

    dfs(-1, 0, 0);
    if(s.empty()) {
        cout << "-1";
    } else {
        for(int l:s) {
            cout << l << " ";
        }
    }
}
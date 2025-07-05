#include<bits/stdc++.h>
using namespace std;

int MAX = -0x3f3f3f3f;
int MIN = 0x3f3f3f3f;
int n, a[11], p, s, m, d;

int opt[11];

void dfs(int depth) {
    if(depth==n) {
        int sum=0, last=a[0];
        for(int i=1;i<n;i++) {
            if(opt[i]>=3) {
                if(opt[i]==3) last *= a[i];
                else last /= a[i];
            } else {
                sum += last;
                if(opt[i]==1) last = a[i];
                else last = -a[i];
            }
        }
        sum += last;

        MAX = max(MAX, sum);
        MIN = min(MIN, sum);
        return;
    }
    if(p) {
        p--;
        opt[depth]=1;
        dfs(depth+1);
        p++;
    }
    if(s) {
        s--;
        opt[depth]=2;
        dfs(depth+1);
        s++;
    }
    if(m) {
        m--;
        opt[depth]=3;
        dfs(depth+1);
        m++;
    }
    if(d) {
        d--;
        opt[depth]=4;
        dfs(depth+1);
        d++;
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n;
    for(int i=0;i<n;i++) cin >> a[i];
    cin >> p >> s >> m >> d;
    dfs(1);
    cout << MAX << '\n' << MIN;
}
#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

int n, m;
ll bit[35];
bool conn[35][35];
int minCnt=35;
unordered_map<ll, int> vals;

void back1(int start=0, ll val=0, int cnt=0) {
    if(!vals.count(val)) vals[val]=cnt;
    else vals[val] = min(vals[val], cnt);
    if(start==n/2) return;
    for(int i=start;i<n/2;i++) back1(i+1, val^bit[i], cnt+1);
}

void back2(int start=n/2, ll val=0, int cnt=0) {
    if(vals.count(val^((1LL<<n)-1))) {
        minCnt = min(minCnt, vals[val^((1LL<<n)-1)]+cnt);
        return;
    }
    if(start==n) return;
    for(int i=start;i<n;i++) back2(i+1, val^bit[i], cnt+1);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> m;
    for(int i=0;i<n;i++) conn[i][i]=true;
    while(m--) {
        int a, b; cin >> a >> b;
        conn[a-1][b-1]=conn[b-1][a-1]=true;
    }

    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            if(conn[i][j]) bit[i] |= 1LL<<j;
        }
    }
    back1();
    back2();
    cout << minCnt;
}
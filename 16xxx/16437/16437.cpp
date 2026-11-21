#include<bits/stdc++.h>
#define MAX 123457

using namespace std;
typedef long long ll;

ll total=0;
ll SorH[MAX] = {0, };
vector<vector<int>> child = vector<vector<int>>(MAX);

ll dfs(int cur, ll sum) {
    sum += SorH[cur];

    if(sum>0) {
        total += sum;
        sum=0;
    }
    for(int next:child[cur]) {
        sum = max(sum, dfs(next, sum));
        if(sum>0) {
            total += sum;
            sum=0;
        }
    }
    return sum;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    for(int i=2;i<=N;i++) {
        char t; ll a; int p; cin >> t >> a >> p;
        if(t=='W') {
            SorH[i] = -a;
        } else {
            SorH[i] = a;
        }
        child[p].push_back(i);
    }

    dfs(1, 0);
    cout << total;
}
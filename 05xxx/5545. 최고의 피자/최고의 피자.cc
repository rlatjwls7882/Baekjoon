#include<bits/stdc++.h>
using namespace std;

int N, A, B, C, _max=0;
int D[100] = {0, };

void dfs(int cur, int sum, int cnt) {
    _max = max(_max, (C+sum)/(A+B*cnt));
    for(int i=cur;i<N;i++) {
        if(_max<=(C+sum+D[i])/(A+B*(cnt+1))) {
            dfs(i+1, sum+D[i], cnt+1);
        }
    }
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> N >> A >> B >> C;

    for(int i=0;i<N;i++) {
        cin >> D[i];
    }
    sort(D, D+N, greater<int>());

    dfs(0, 0, 0);
    cout << _max;
}
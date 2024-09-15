#include<bits/stdc++.h>
#define MAX 200000
using namespace std;

int parent[MAX];

int find(int x) {
    if (x==parent[x]) return x;
    return parent[x] = find(parent[x]);
}

void merge(int x, int y) {
    x = find(x);
    y = find(y);

    if (x<y) {
        parent[y] = x;
    } else {
        parent[x] = y;
    }
}

int main(void) {
    int N, Q; cin >> N >> Q;
    int p[N] = {0, };
    for (int i=1;i<=N-1;i++) {
        cin >> p[i]; p[i]--;
    }

    vector<vector<int>> query = vector<vector<int>>(Q+N-1);
    for (int i=0;i<Q+N-1;i++) {
        int a, b; cin >> a >> b;
        query[i].push_back(a);
        query[i].push_back(b-1);
        if (a==1) {
            int c; cin >> c;
            query[i].push_back(c-1);
        }
    }

    for (int i=0;i<N;i++) {
        parent[i] = i;
    }

    stack<bool> stk;
    for (int i=Q+N-2;i>=0;i--) {
        if (query[i][0]==0) {
            merge(query[i][1], p[query[i][1]]);
        } else {
            stk.push(find(query[i][1])==find(query[i][2]));
        }
    }
    while(!stk.empty()) {
        if (stk.top()) {
            cout << "YES\n";
        } else {
            cout << "NO\n";
        }
        stk.pop();
    }
}
#include <bits/stdc++.h>
using namespace std;

int num=0, cnt=0;
int parent[100001] = {0, };
int arr[100001] = {0, };

int dfs(int cur) {
    if(parent[cur] && parent[cur]!=num) return 0;
    else if(parent[cur]) return cur;
    parent[cur]=num;

    int tmp = dfs(arr[cur]);
    if(tmp && tmp!=cur) return tmp;
    if(!tmp) cnt++;
    return 0;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int T; cin >> T;
    while(T-->0) {
        int n; cin >> n;
        for(int i=1;i<=n;i++) {
            cin >> arr[i];
        }

        cnt=0;
        fill(parent, parent+n+1, 0);
        for(int i=1;i<=n;i++) {
            if(!parent[i]) {
                num++;
                dfs(i);
            }
        }
        cout << cnt << '\n';
    }
}
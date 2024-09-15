#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int yes[N+2] = {0, 1, }, no[N+2] = {0, };

    for(int i=2;i<=N+1;i++) {
        int a, x, y; cin >> a >> x >> y;
        yes[i] = yes[i-1];
        no[i] = no[i-1];

        if(a==1) {
            if(yes[y]-yes[x-1]==y-x+1) yes[i]++;
            else no[i]++;
        } else {
            if(no[y]-no[x-1]==y-x+1) yes[i]++;
            else no[i]++;
        }

        if(yes[i] == yes[i-1]+1) cout << "Yes\n";
        else cout << "No\n";
    }
}
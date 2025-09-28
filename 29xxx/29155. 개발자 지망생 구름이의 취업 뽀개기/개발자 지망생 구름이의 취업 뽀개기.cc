#include<bits/stdc++.h>
using namespace std;

int p[5];
vector<vector<int>> problem(5);

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<5;i++) cin >> p[i];

    while(n--) {
        int k, t; cin >> k >> t;
        problem[k-1].push_back(t);
    }

    int total=240;
    for(int i=0;i<5;i++) {
        sort(problem[i].begin(), problem[i].end());
        for(int j=0;j<p[i];j++) {
            if(j) total += problem[i][j]-problem[i][j-1];
            total += problem[i][j];
        }
    }
    cout << total;
}
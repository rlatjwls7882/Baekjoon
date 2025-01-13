#include<bits/stdc++.h>
using namespace std;

vector<vector<string>> res(12);

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    res[1].push_back("1");
    res[2].push_back("2");
    res[3].push_back("3");
    for(int i=2;i<=11;i++) {
        for(int j=1;j<=3;j++) {
            if(i-j>=1) {
                for(string e:res[i-j]) {
                    res[i].push_back(e+"+"+to_string(j));
                }
            }
        }
        sort(res[i].begin(), res[i].end());
    }

    int n, k; cin >> n >> k;
    if(res[n].size()<k) cout << -1;
    else cout << res[n][k-1];
}
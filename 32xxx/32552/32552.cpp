#include<bits/stdc++.h>
using namespace std;

vector<int> arr;
vector<vector<int>> idxs(10'001);

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, k; cin >> n >> k;
    // A와 B 위아래 위치 변경
    for(int i=0;i<n*k;i++) {
        int a; cin >> a;
        idxs[a].push_back(i);
    }
    for(int i=0;i<n*k;i++) {
        int b; cin >> b;
        for(int j=k-1;j>=0;j--) arr.push_back(idxs[b][j]);
    }

    vector<int> lis;
    for(int e:arr) {
        if(lis.empty() || lis.back()<e) lis.push_back(e);
        else lis[lower_bound(lis.begin(), lis.end(), e)-lis.begin()]=e;
    }
    cout << lis.size();
}
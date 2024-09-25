#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, k; cin >> n >> k;
    int nums[n] = {0, };
    map<int, int> hashMap;
    for(int i=0;i<n;i++) {
        string s; cin >> s;
        for(int j=0;j<k;j++) nums[i] = nums[i]*2+s[j]-'0';
        hashMap[nums[i]]=i;
    }

    vector<vector<int>> conn(n);
    for(int i=0;i<n;i++) {
        int cur = nums[i];
        for(int j=0;j<k;j++) {
            int next = cur^(1<<j);
            if(hashMap.find(next)!=hashMap.end()) conn[i].push_back(hashMap[next]);
        }
    }

    int s, e; cin >> s >> e;
    int prev[n]; fill(prev, prev+n, -1);
    queue<int> q; q.push(s-1);
    prev[s-1]=-2;
    while(!q.empty()) {
        int cur = q.front(); q.pop();
        for(int next:conn[cur]) {
            if(prev[next]==-1) {
                q.push(next);
                prev[next]=cur;
            }
        }
    }

    if(prev[e-1]==-1) {
        cout << -1;
    } else {
        vector<int> path;
        for(int i=e-1;i!=-2;i=prev[i]) path.push_back(i+1);
        for(int i=path.size()-1;i>=0;i--) cout << path[i] << ' ';
    }
}
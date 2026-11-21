#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, k; cin >> n >> k;
    map<long long, int> hashMap;
    long long nums[n] = {0, };
    for(int i=0;i<n;i++) {
        string s; cin >> s;
        for(int j=0;j<k;j++) nums[i] = nums[i]*2+(s[j]-'0');
        hashMap[nums[i]]=i;
    }

    vector<vector<int>> conn(n);
    for(int i=0;i<n;i++) {
        long long cur = nums[i];
        for(int j=0;j<k;j++) {
            long long next = cur^(1<<j);
            if(hashMap.find(next) != hashMap.end()) conn[i].push_back(hashMap[next]);
        }
    }

    int prv[n]; fill(prv, prv+n, -1);
    queue<int> q; q.push(0);
    prv[0]=-2;
    while(!q.empty()) {
        int cur = q.front(); q.pop();
        for(int next:conn[cur]) {
            if(prv[next]==-1) {
                prv[next]=cur;
                q.push(next);
            }
        }
    }

    int m; cin >> m;
    while(m-->0) {
        int j; cin >> j; j--;
        if(prv[j]==-1) {
            cout << "-1\n";
        } else {
            vector<int> path;
            while(j>=0) {
                path.push_back(j+1);
                j=prv[j];
            }
            for(int i=path.size()-1;i>=0;i--) cout << path[i] << ' ';
            cout << '\n';
        }
    }
}
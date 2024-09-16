#include<bits/stdc++.h>
using namespace std;

int parent[200001];
int _find(int x) {
    if(parent[x]==x) return x;
    return parent[x] = _find(parent[x]);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, c; cin >> n >> c;
    vector<pair<int, int>> v;
    for(int i=0;i<n;i++) {
        int d, t, p; cin >> d >> t >> p;
        v.push_back({p, d-t+1});
    }
    sort(v.begin(), v.end(), greater<pair<int, int>>());
    for(int i=1;i<=n;i++) parent[i]=i;

    int totalPoints=0, cnt=0;;
    for(int i=0;i<n;i++) {
        int x = _find(v[i].second);
        if(x!=0) {
            parent[x]=x-1;
            cnt++;
            totalPoints += v[i].first;
        }
        if(totalPoints>=c) {
            cout << cnt;
            return 0;
        }
    }
    cout << "I'm sorry professor Won!";
}
#include<bits/stdc++.h>

using namespace std;
typedef long long ll;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    vector<vector<int>> connect = vector<vector<int>>(N+1);
    for(int i=0;i<N;i++) {
        int a, b; cin >> a >> b;
        connect[b].push_back(a);
    }

    ll total=0;
    for(vector<int> points:connect) {
        if(points.size()<=1) continue;
        sort(points.begin(), points.end());
        ll sum=0;
        for(int i=0;i<points.size();i++) {
            if(i==0) {
                sum += points[i+1]-points[i];
            } else if(i==points.size()-1) {
                sum += points[i]-points[i-1];
            } else {
                sum += min(points[i+1]-points[i], points[i]-points[i-1]);
            }
        }
        total+=sum;
    }
    cout << total;
}
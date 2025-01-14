#include<bits/stdc++.h>
using namespace std;

vector<long long> v;

void back(int depth, int cur, long long val) {
    if(depth) v.push_back(val);
    for(int i=cur;i>=0;i--) back(depth+1, i-1, val*10+i);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N; cin >> N;
    back(0, 9, 0);
    sort(v.begin(), v.end());
    if(N>v.size()) cout << -1;
    else cout << v[N-1];
}
#include<bits/stdc++.h>
using namespace std;

vector<int> v;

void dfs(int left, int right) {
    if(left==right) {
        cout << v[left] << ' ';
        return;
    }

    int mid = (left+right)/2;
    dfs(left, mid-1);
    dfs(mid+1, right);
    cout << v[mid] << ' ';
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    while(n-->-1) {
        int val; cin >> val;
        if(val!=-1) v.push_back(val);
    }
    sort(v.begin(), v.end());
    dfs(0, v.size()-1);
}
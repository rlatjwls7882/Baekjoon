#include <bits/stdc++.h>
using namespace std;

int n, k, curMoney=0;
long long c[32], v[32];
vector<long long> value;
vector<long long> minCostAtIdx;
map<long long, long long> valueToCost;
long long minCost = LONG_LONG_MAX;

void dfs1(int start, long long totalValue, long long totalCost) {
    if(totalValue>k) {
        minCost = min(minCost, totalCost);
        return;
    }
    if(!valueToCost.count(totalValue)) {
        valueToCost[totalValue] = totalCost;
        value.push_back(totalValue);
    }
    else valueToCost[totalValue] = min(valueToCost[totalValue], totalCost);
    for(int i=start;i<n/2;i++) {
        dfs1(i+1, totalValue+v[i], totalCost+c[i]);
    }
}

void dfs2(int start, long long totalValue, long long totalCost) {
    if(totalValue>k) {
        minCost = min(minCost, totalCost);
        return;
    }

    int left=0, right=value.size()-1;
    while(left<right) {
        int mid = (left+right)/2;
        if(value[mid]+totalValue >= k) right = mid;
        else left = mid+1;
    }
    if(value[left]+totalValue >= k) minCost = min(minCost, totalCost+minCostAtIdx[left]);

    for(int i=start;i<n;i++) {
        dfs2(i+1, totalValue+v[i], totalCost+c[i]);
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> n;
    for(int i=0;i<n;i++) cin >> c[i];
    for(int i=0;i<n;i++) cin >> v[i];
    cin >> k;

    int m; cin >> m;
    while(m-->0) {
        int idx; cin >> idx;
        curMoney += c[idx];
    }
    dfs1(0, 0, 0);
    sort(value.begin(), value.end());

    minCostAtIdx = vector<long long>(value.size());
    minCostAtIdx.back() = valueToCost[value.back()];
    for(int i=value.size()-2;i>=0;i--) {
        minCostAtIdx[i] = min(minCostAtIdx[i+1], valueToCost[value[i]]);
    }
    dfs2(n/2, 0, 0);

    if(minCost==LONG_LONG_MAX) cout << -1;
    else cout << max(0LL, minCost-curMoney);
}
#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    vector<pair<int, int>> v;
    for(int i=0;i<N;i++) {
        int a, b; cin >> a >> b;
        v.push_back(make_pair(a, b));
    }
    sort(v.begin(), v.end());

    int maxProfit=-1000000, price=100000000;
    for(int i=0;i<N;i++) {
        int curProfit=0;
        for(int j=i;j<N;j++) {
            curProfit += max(v[i].first-v[j].second, 0);
        }

        if(curProfit>maxProfit || curProfit==maxProfit && price>v[i].first) {
            maxProfit=curProfit;
            price=v[i].first;
        }
    }

    if(maxProfit==0) cout << 0;
    else cout << price;
}
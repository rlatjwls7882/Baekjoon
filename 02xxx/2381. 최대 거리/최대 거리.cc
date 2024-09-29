#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;

    vector<int> plus, minus;
    for(int i=0;i<n;i++) {
        int x, y; cin >> x >> y;
        plus.push_back(x+y);
        minus.push_back(x-y);
    }
    sort(plus.begin(), plus.end());
    sort(minus.begin(), minus.end());

    cout << max(abs(plus.back()-plus.front()), abs(minus.back()-minus.front()));
}
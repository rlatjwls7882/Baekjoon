#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int a, b, cnt; cin >> a >> b >> cnt;

    vector<int> row;
    vector<int> col;
    while(cnt-->0) {
        int x, y; cin >> x >> y;
        if(x==0) {
            row.push_back(y);
        } else {
            col.push_back(y);
        }
    }
    sort(row.begin(), row.end());
    sort(col.begin(), col.end());

    int maxRow=0, before=0;
    for(int cur:row) {
        maxRow = max(maxRow, cur-before);
        before=cur;
    }
    maxRow = max(maxRow, b-before);

    int maxCol=0; before=0;
    for(int cur:col) {
        maxCol = max(maxCol, cur-before);
        before=cur;
    }
    maxCol = max(maxCol, a-before);

    cout << maxRow*maxCol;
}
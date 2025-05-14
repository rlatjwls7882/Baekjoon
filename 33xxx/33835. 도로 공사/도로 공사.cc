#include<bits/stdc++.h>
using namespace std;

int pos[100'001][2];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=1;i<=n;i++) cin >> pos[i][0] >> pos[i][1];
    cout << setprecision(5) << fixed << sqrt(pow(pos[n][0]-pos[1][0], 2)+pow(pos[n][1]-pos[1][1], 2));
}
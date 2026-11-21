#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int h, m, s; char ch; cin >> h >> ch >> m >> ch >> s;
    int start = h*3600+m*60+s;
    cin >> h >> ch >> m >> ch >> s;
    int end = h*3600+m*60+s;
    int t, k; cin >> t >> k;
    cout << (start+t*(100-k)/100<=end);
}
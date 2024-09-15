#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    int cnt=0;
    map<int, int> m;
    while(N-->0) {
        int H; cin >> H;
        if(m[H+1]) m[H+1]--;
        else cnt++;
        m[H]++;
    }
    cout << cnt;
}
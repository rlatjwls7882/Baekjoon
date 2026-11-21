#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t; cin >> t;
    string P[8] = {"000", "001", "010", "011", "100", "101", "110", "111"};
    while(t-->0) {
        int a, b, c, d; cin >> a >> b >> c >> d;
        int cnt=0;
        for(int i=0;i<3;i++) {
            if(P[a][i]==P[b][i] && P[a][i]==P[c][i] && P[a][i]==P[d][i]) {
                cnt++;
            }
        }
        if(cnt==1) cout << "YES\n";
        else cout << "NO\n";
    }
}
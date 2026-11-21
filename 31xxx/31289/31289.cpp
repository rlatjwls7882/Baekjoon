#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

typedef long long ll;
typedef long double ld;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acos(-1);

int dp[201][201][201];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    for(int x=0;x<=200;x++) {
        for(int y=0;y<=200;y++) {
            for(int z=0;z<=200;z++) {
                if(!(x^y^z)) {
                    for(int i=0;i<=200;i++) {
                        if(i<x) dp[x][y][z] = max(dp[x][y][z], x+y+z-dp[i][y][z]);
                        if(i<y) dp[x][y][z] = max(dp[x][y][z], x+y+z-dp[x][i][z]);
                        if(i<z) dp[x][y][z] = max(dp[x][y][z], x+y+z-dp[x][y][i]);
                    }
                } else {
                    if((x^y)<z) dp[x][y][z] = max(dp[x][y][z], x+y+z-dp[x][y][x^y]);
                    if((x^z)<y) dp[x][y][z] = max(dp[x][y][z], x+y+z-dp[x][x^z][z]);
                    if((y^z)<x) dp[x][y][z] = max(dp[x][y][z], x+y+z-dp[y^z][y][z]);
                }
            }
        }
    }

    int t; cin >> t;
    while(t--) {
        int x, y, z; cin >> x >> y >> z;
        cout << dp[x][y][z]*10000 << ' ' << (x+y+z-dp[x][y][z])*10000 << '\n';
    }
}
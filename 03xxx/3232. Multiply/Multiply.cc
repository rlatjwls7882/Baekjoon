#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

typedef long long ll;
typedef long double ld;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acos(-1);

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int t; cin >> t;
    while(t--) {
        string x, y, z; cin >> x >> y >> z;
        int b=1;
        for(char ch:x) b = max(b, ch-'0'+1);
        for(char ch:y) b = max(b, ch-'0'+1);
        for(char ch:z) b = max(b, ch-'0'+1);

        int ret=0;
        for(int i=b;i<=16;i++) {
            int a=0, b=0, c=0;
            for(char ch:x) a=a*i+ch-'0';
            for(char ch:y) b=b*i+ch-'0';
            for(char ch:z) c=c*i+ch-'0';
            if(a*b==c) {
                ret=i;
                break;
            }
        }
        cout << ret << '\n';
    }
}
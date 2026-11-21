#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

typedef long long ll;
typedef long double ld;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acos(-1);

int cnt[4];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    string a, b; cin >> a >> b;
    for(char ch:a) {
        if(ch=='R') cnt[0]++;
        else if(ch=='G') cnt[1]++;
        else if(ch=='B') cnt[2]++;
        else if(ch=='Y') cnt[3]++;
    }
    for(char ch:b) {
        if(ch=='R') cnt[0]--;
        else if(ch=='G') cnt[1]--;
        else if(ch=='B') cnt[2]--;
        else if(ch=='Y') cnt[3]--;
    }

    int res=0;
    for(int i=0;i<4;i++) res+=abs(cnt[i]);
    cout << res/2;
}
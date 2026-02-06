#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

#define ff first
#define ss second

typedef long long ll;
typedef long double ld;
typedef pair<int, int> pii;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);

ll sq(ll x) { return x*x; }
ld sq(ld x) { return x*x; }

int dx[] = {2, -2, 1, -1, 2, -2, 1, -1};
int dy[] = {1, 1, 2, 2, -1, -1, -2, -2};

int main() {
    cin.tie(0)->sync_with_stdio(0);
    string s; cin >> s;

    vector<string> res;
    int x = s[0]-'a';
    int y = s[1]-'1';
    for(int i=0;i<8;i++) {
        int nx = x+dx[i];
        int ny = y+dy[i];
        if(nx<0 || nx>=8 || ny<0 || ny>=8) continue;
        string tmp="aa";
        tmp[0]=(char)(nx+'a');
        tmp[1]=(char)(ny+'1');
        res.push_back(tmp);
    }
    sort(res.begin(), res.end());
    for(auto e:res) cout << e << '\n';
}
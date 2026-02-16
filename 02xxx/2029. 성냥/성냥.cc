#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

#define x first
#define y second
#define all(x) x.begin(), x.end()
#define compress(x) sort(all(x)), x.erase(unique(all(x)), x.end())

typedef long long ll;
typedef long double ld;
typedef pair<int, int> pii;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);

mt19937 rd((unsigned)chrono::steady_clock::now().time_since_epoch().count());
uniform_int_distribution<int> rnd_int(0, 0); // rnd_int(rd)
uniform_real_distribution<double> rnd_real(0, 1); // rnd_real(rd)

ll sq(ll x) { return x*x; }
ld sq(ld x) { return x*x; }

string s[10];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    for(int i=0;i<10;i++) cin >> s[i];

    int a=0, b=0;
    for(int sz=1;sz<=3;sz++) {
        for(int i=0;i<=3-sz;i++) {
            for(int j=0;j<=3-sz;j++) {
                bool chk=true;
                for(int k=0;k<sz;k++) chk &= s[i*3][(j+k)*3+1]=='-' && s[(i+sz)*3][(j+k)*3+1]=='-';
                for(int k=0;k<sz;k++) chk &= s[(i+k)*3+1][j*3]=='|' && s[(i+k)*3+1][(j+sz)*3]=='|';
                b += chk;
            }
        }
    }
    for(int i=1;i<10;i+=3) {
        for(int j=0;j<10;j+=3) {
            if(s[i][j]!='|') a++;
            if(s[j][i]!='-') a++;
        }
    }
    cout << a << ' ' << b;
}
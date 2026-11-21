#include<bits/stdc++.h>
using namespace std;

typedef long double ld;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    ld n, m, k; cin >> n >> m >> k;

    ld last=1, sum=0;
    while(k--) {
        ld cur, curM; cin >> cur >> curM;
        sum += (cur-last)*4/(m/60);
        last = cur;
        m = curM;
    }
    sum += (n-last+1)*4/(m/60);
    cout << fixed << setprecision(6) << sum;
}
#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
const ll MOD = 1e9+7;

typedef vector<vector<ll>> matrix;

matrix mult(matrix a, matrix b) {
    matrix ret = {{0, 0}, {0, 0}};
    for(int i=0;i<2;i++) {
        for(int j=0;j<2;j++) {
            for(int k=0;k<2;k++) {
                ret[i][j] += a[i][k]*b[k][j];
            }
            ret[i][j] = (ret[i][j]+MOD)%MOD;
        }
    }
    return ret;
}

matrix getMatrix(matrix x, ll n) {
    if(n==1) {
        return x;
    }

    matrix tmp = getMatrix(x, n/2);

    if(n%2==1) {
        return mult(mult(tmp, tmp), x);
    } else {
        return mult(tmp, tmp);
    }
}

ll getCnt(ll n) {
    matrix res = getMatrix({{4, -1}, {1, 0}}, n);
    return (res[1][0]*3+res[1][1]) % MOD;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    ll n; cin >> n;
    if(n%2==1) {
        cout << 0;
        return 0;
    }
    cout << getCnt(n/2);
}
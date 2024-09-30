#include<bits/stdc++.h>
using namespace std;

long long MOD = 1000000007;

vector<vector<long long>> mult(vector<vector<long long>> A, vector<vector<long long>> B) {
    vector<vector<long long>> tmp({{0, 0}, {0, 0}});
    for(int i=0;i<2;i++) {
        for(int j=0;j<2;j++) {
            for(int k=0;k<2;k++) {
                tmp[i][j] += A[i][k]*B[k][j];
                tmp[i][j]%=MOD;
            }
        }
    }
    return tmp;
}

vector<vector<long long>> expo_square(vector<vector<long long>> A, long long K) {
    vector<vector<long long>> ret({{1, 0}, {0, 1}});
    while(K) {
        if(K%2==1) ret = mult(ret, A);
        A = mult(A, A);
        K>>=1;
    }
    return ret;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    long long n; cin >> n;
    vector<vector<long long>> ret = expo_square({{1, 1}, {1, 0}}, n);
    cout << ret[1][0];
}
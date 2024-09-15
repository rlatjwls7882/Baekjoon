#include<bits/stdc++.h>
#define SEC 100000000
using namespace std;
typedef long long ll;

bool chk(string S, ll N, int T, int L) {
    if(S.compare("O(N)")==0) {
        if(N*T<=L*SEC) return true;
        else return false;
    } else if(S.compare("O(N^2)")==0) {
        if(N*N*T<=L*SEC) return true;
        else return false;
    } else if(S.compare("O(N^3)")==0) {
        if(N*N*N>L*SEC) return false; // N, T가 최댓값이면 long long 범위를 벗어남
        if(N*N*N*T<=L*SEC) return true;
        else return false;
    } else if(S.compare("O(2^N)")==0) {
        ll sum=T;
        while(N-->0) {
            sum*=2;
            if(sum>L*SEC) return false;
        }
        return true;
    } else {
        ll sum=T;
        for(ll i=2;i<=N;i++) {
            sum *= i;
            if(sum>L*SEC) return false;
        }
        return true;
    }
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int C; cin >> C;
    while(C-->0) {
        string S; int N, T, L; cin >> S >> N >> T >> L;
        if(chk(S, N, T, L)) cout << "May Pass.\n";
        else cout << "TLE!\n";
    }
}
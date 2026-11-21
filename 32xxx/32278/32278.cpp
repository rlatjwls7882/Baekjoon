#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    long long N; cin >> N;
    if(SHRT_MIN<=N && N<=SHRT_MAX) cout << "short";
    else if(INT_MIN<=N && N<=INT_MAX) cout << "int";
    else cout << "long long";
}
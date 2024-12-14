#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N, M; cin >> N >> M;
    
    cout << "SN " << N;
    if(M<=26) cout << (char)('A'+M-1);
    else cout << (char)('a'+(M-1)/26-1) << (char)('a'+(M-1)%26);
}
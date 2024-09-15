#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, K; cin >> N >> K;
    for(int i=0;i<N-K+1;i++) {
        cout << 'a';
    }
    for(int i=1;i<K;i++) {
        cout << char('a'+i);
    }
}
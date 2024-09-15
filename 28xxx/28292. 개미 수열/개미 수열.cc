#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    if(N<=2) cout << 1;
    else if(N<=5) cout << 2;
    else cout << 3;
}
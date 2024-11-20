#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    if(2024<=n && n<=100000 && n%2024==0) cout << "Yes";
    else cout << "No";
}
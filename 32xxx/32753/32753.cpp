#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, k; cin >> n >> k;
    if(n==2 && k==1) cout << "1 2";
    else if(n==1) for(int i=0;i<k;i++) cout << "1 ";
    else cout << -1;
}
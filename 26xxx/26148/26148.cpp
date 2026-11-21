#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    int ret = 2*4 + 3*7;
    if(n%4==0 && n%100!=0 || n%400==0) ret++;
    cout << ret;
}
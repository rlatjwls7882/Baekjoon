#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    long long a, b; cin >> a >> b;
    if(a<=2) a=3;
    if(b<=2) b=3;
    cout << (b/2)*(b/2+1)/2*2 - ((a-1)/2)*((a-1)/2+1)/2*2;
}
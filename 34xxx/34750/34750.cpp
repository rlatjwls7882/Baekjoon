#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    int give;
    if(n>=1'000'000) give = n/10*2;
    else if(n>=500'000) give = n/100*15;
    else if(n>=100'000) give = n/10;
    else give = n/100*5;
    cout << give << ' ' << n-give;
}
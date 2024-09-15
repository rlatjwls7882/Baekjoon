#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    long long N; int b; cin >> N >> b;

    int len=0;
    while(N>1) {
        N/=2;
        len++;
    }

    if(len<=b) cout << "yes";
    else cout << "no";
}
#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    while(true) {
        long long m; cin >> m;
        if(m==0) break;

        cout << "Y " << m*(m-1)+1 << '\n';
    }
}
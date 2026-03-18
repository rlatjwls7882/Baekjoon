#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int k; cin >> k;
    string s=string(100, '2'), res=string(100, '2');

    for(int i=0;i<100;i++) {
        s[i]='0';
        cout << "? " << s << '\n' << flush;
        s[i]='2';
        int in; cin >> in;
        if(k==in) res[i]='0';
        else if(k>in) res[i]='5';
    }
    cout << "! " << res << '\n' << flush;
}
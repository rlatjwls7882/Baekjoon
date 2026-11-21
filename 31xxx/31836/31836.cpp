#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    vector<int> X, Y;
    while(n>1) {
        if(n-3>=0) {
            X.push_back(n);
            Y.push_back(n-1);
            Y.push_back(n-2);
            n-=3;
        }
        if(n==2) {
            X.push_back(2);
            Y.push_back(1);
            n-=2;
        }
    }

    cout << X.size() << '\n';
    for(int e:X) cout << e << ' ';
    cout << '\n' << Y.size() << '\n';
    for(int e:Y) cout << e << ' ';
}
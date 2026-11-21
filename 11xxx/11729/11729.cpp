#include<bits/stdc++.h>
using namespace std;

void rec(int n, int from, int to, int another) {
    if(n==1) {
        cout << from << ' ' << to << '\n';
        return;
    }

    rec(n-1, from, another, to);
    cout << from << ' ' << to << '\n';
    rec(n-1, another, to, from);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    cout << (int)pow(2, n)-1 << '\n';
    rec(n, 1, 3, 2);
}
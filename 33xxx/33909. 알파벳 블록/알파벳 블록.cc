#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int s, c, o, n; cin >> s >> c >> o >> n;
    s += n;
    c += o*2;
    cout << min({s/3, c/6});
}
#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);

    double x=-8140;
    for(int i=0;i<814;i++) {
        x += sqrt(i+31);
        cout << x << ' ' << x << '\n';
    }
}
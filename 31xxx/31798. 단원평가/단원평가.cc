#include<bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int a, b, c; cin >> a >> b >> c;
    if(c!=0) {
        cout << c*c-a-b;
    } else {
        cout << sqrt(a+b);
    }
}
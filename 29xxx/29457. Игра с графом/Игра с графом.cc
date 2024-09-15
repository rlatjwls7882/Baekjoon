#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    int n, m; cin >> n >> m;

    if(m==0) {
        cout << "Draw";
    } else if((m-(n-1))%2==0) {
        cout << "Alice";
    } else {
        cout << "Bob";
    }
}
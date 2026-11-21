#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int a, b, n, k; cin >> a >> b >> n >> k;

    int i=1, j=1;
    while(k>n) {
        k -= n;
        if(j++==b) {
            j=1;
            i++;
        }
    }
    cout << i << ' ' << j;
}
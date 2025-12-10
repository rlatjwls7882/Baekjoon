#include<bits/stdc++.h>
using namespace std;

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, k; cin >> n >> k;

    int last=1;
    for(int i=2;i<=n;i++) {
        last = (last+k-1)%i+1;
    }
    cout << last;
}
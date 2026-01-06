#include<bits/stdc++.h>
using namespace std;

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; string a, b; cin >> n >> a >> b;
    if(a==b) {
        cout << "Good";
    } else {
        sort(a.begin(), a.end());
        sort(b.begin(), b.end());
        if(a==b) cout << "Its fine";
        else if(a<b) cout << "Manners maketh man";
        else cout << "Oryang";
    }
}
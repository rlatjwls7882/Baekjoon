#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    vector<string> v(n);
    for(int i=0;i<n;i++) cin >> v[i];

    vector<string> small = v;
    for(int i=0;i<n;i++) sort(small[i].begin(), small[i].end());
    sort(small.begin(), small.end());

    vector<string> big = v;
    for(int i=0;i<n;i++) sort(big[i].begin(), big[i].end(), greater<char>());
    sort(big.begin(), big.end());

    for(int i=0;i<n;i++) {
        string smallS=v[i], bigS=v[i];
        sort(smallS.begin(), smallS.end());
        sort(bigS.begin(), bigS.end(), greater<char>());

        int a = upper_bound(big.begin(), big.end(), smallS) - big.begin();
        int b = upper_bound(small.begin(), small.end(), bigS) - small.begin();
        if(smallS!=bigS) a++;
        cout << a << ' ' << b << '\n';
    }
}
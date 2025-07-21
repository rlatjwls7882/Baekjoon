#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    vector<int> x(n);
    for(int i=0;i<n;i++) cin >> x[i];

    if(x[0]==*min_element(x.begin(), x.end())) cout << "ez";
    else if(x[0]==*max_element(x.begin(), x.end())) cout << "hard";
    else cout << "?";
}
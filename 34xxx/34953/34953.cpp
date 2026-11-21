#include<bits/stdc++.h>
using namespace std;

string SHS="SHS";

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    cout << 'S';
    for(int i=0;i<n-1;i++) cout << SHS[i%3];
}
#include<bits/stdc++.h>
using namespace std;
typedef long long ll;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    ll arr[68] = {1, 1, 2, 4};
    for(int i=4;i<=68;i++) {
        arr[i]=arr[i-1]+arr[i-2]+arr[i-3]+arr[i-4];
    }
    
    int t; cin >> t;
    while(t-->0) {
        int n; cin >> n;
        cout << arr[n] << '\n';
    }
}
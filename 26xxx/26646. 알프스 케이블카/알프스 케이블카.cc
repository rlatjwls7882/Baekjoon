#include<bits/stdc++.h>
using namespace std;

int h[50000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) cin >> h[i];
    
    int sum=0;
    for(int i=1;i<n;i++) {
        sum += pow(h[i]+h[i-1], 2)+pow(h[i]-h[i-1], 2);
    }
    cout << sum;
}
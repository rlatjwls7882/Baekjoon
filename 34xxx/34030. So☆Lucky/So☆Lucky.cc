#include<bits/stdc++.h>
using namespace std;

int a[200'000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) cin >> a[i];

    bool odd=true;
    int lastOdd=0, lastEven=0;
    for(int i=0;i<n;i++) {
        if(a[i]%2) {
            if(lastOdd>a[i]) odd=false;
            lastOdd=a[i];
        } else {
            if(lastEven>a[i]) odd=false;
            lastEven=a[i];
        }
    }
    bool even=true;
    for(int i=0;i<n-1;i++) {
        if(a[i]%2!=a[i+1]%2 && a[i]>a[i+1]) even=false;
    }

    cout << (odd ? "So Lucky\n" : "Unlucky\n");
    cout << (even ? "So Lucky" : "Unlucky");
}
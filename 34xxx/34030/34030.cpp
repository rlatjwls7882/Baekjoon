#include<bits/stdc++.h>
using namespace std;

int n, a[200'000];

bool isOdd() {
    int lastOdd=0, lastEven=0;
    for(int i=0;i<n;i++) {
        if(a[i]%2) {
            if(lastOdd>a[i]) return false;
            lastOdd=a[i];
        } else {
            if(lastEven>a[i]) return false;
            lastEven=a[i];
        }
    }
    return true;
}

bool isEven() {
    for(int i=0;i<n-1;i++) {
        if(a[i]%2!=a[i+1]%2 && a[i]>a[i+1]) return false;
    }
    return true;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n;
    for(int i=0;i<n;i++) cin >> a[i];

    cout << (isOdd() ? "So Lucky\n" : "Unlucky\n");
    cout << (isEven() ? "So Lucky" : "Unlucky");
}

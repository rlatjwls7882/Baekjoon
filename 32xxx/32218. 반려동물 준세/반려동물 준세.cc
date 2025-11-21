#include<bits/stdc++.h>
using namespace std;

int n, a[200], b[200];

bool equal() {
    for(int i=0;i<n;i++) {
        if(a[i]!=b[i]) return false;
    }
    return true;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n;
    for(int i=0;i<n;i++) cin >> a[i];

    int cnt=1;
    while(true) {
        for(int i=0;i<n;i++) {
            b[i]=0;
            for(int j=i+1;j<n;j++) {
                if(a[i]<a[j]) b[i]++;
            }
        }
        if(equal()) break;

        memcpy(a, b, sizeof a);
        cnt++;
        if(cnt>=10000) {
            cout << -1;
            return 0;
        }
    }
    cout << cnt;
}
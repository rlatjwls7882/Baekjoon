#include<bits/stdc++.h>
using namespace std;

int a[3000], b[3000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) cin >> a[i];
    for(int i=0;i<n;i++) cin >> b[i];

    int cnt=0, left=0;
    while(left<n) {
        cnt++;
        int right=left, minA=left, minB=left;
        for(int i=left+1;i<n;i++) {
            if(a[minA]>a[i]) minA=i;
            if(b[minB]>b[i]) minB=i;
            if(minA==minB) right=i;
        }
        left = right+1;
    }
    cout << cnt;
}
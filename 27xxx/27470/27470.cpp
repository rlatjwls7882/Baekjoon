#include<bits/stdc++.h>
using namespace std;

int n;
int a[500'000], original[500'000];

bool chk(int i) {
    int cnt=0;
    for(int k=0;k<n;k++) {
        if(a[k]%i==0) cnt++;
        while(a[k]%i==0) a[k]/=i;
    }
    if(cnt>=(n+1)/2) {
        cnt=(n+1)/2;
        cout << "YES\n";
        for(int k=0;k<n;k++) {
            if(original[k]%i==0 && cnt-->0) cout << original[k] << ' ';
        }
        return true;
    }
    return false;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n;
    for(int i=0;i<n;i++) {
        cin >> a[i];
        original[i]=a[i];
    }
    random_shuffle(a, a+n);

    for(int i=0;i<min(n, 10);i++) {
        for(int j=2;j*j<=a[i];j++) {
            if(a[i]%j==0 && chk(j)) return 0;
        }
        if(a[i]!=1 && chk(a[i])) return 0;
    }
    cout << "NO";
}
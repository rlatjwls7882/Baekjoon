#include<bits/stdc++.h>
using namespace std;

int m, a[10000];

bool chk(int i) {
    int last=0;
    for(int j=0;j<m;j++) {
        last+=a[j];
        if(last==i) last=0;
        else if(last>i) return false;
    }
    return chk && last==0;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        cin >> m;
        int sum=0;
        for(int i=0;i<m;i++) {
            cin >> a[i];
            sum += a[i];
        }

        int res=sum;
        for(int i=1;i*i<sum;i++) {
            if(sum%i==0) {
                if(chk(i)) res = min(res, i);
                if(chk(sum/i)) res = min(res, sum/i);
            }
        }
        cout << res << '\n';
    }
}

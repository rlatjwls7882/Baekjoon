#include<bits/stdc++.h>
using namespace std;

int a[10000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        int m; cin >> m;
        int sum=0;
        for(int i=0;i<m;i++) {
            cin >> a[i];
            sum += a[i];
        }

        int res=sum;
        for(int i=1;i*i<sum;i++) {
            if(sum%i==0) {
                bool chk=true;
                int last=0;
                for(int j=0;j<m;j++) {
                    last+=a[j];
                    if(last==i) {
                        last=0;
                    } else if(last>i) {
                        chk=false;
                        break;
                    }
                }
                if(chk && last==0) res = min(res, i);

                chk=true;
                last=0;
                for(int j=0;j<m;j++) {
                    last+=a[j];
                    if(last==sum/i) {
                        last=0;
                    } else if(last>sum/i) {
                        chk=false;
                        break;
                    }
                }
                if(chk && last==0) res = min(res, sum/i);
            }
        }
        cout << res << '\n';
    }
}
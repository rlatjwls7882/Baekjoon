#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    while(true) {
        int n; cin >> n;
        if(!n) break;

        int cnt=0;
        for(int i=1;i*i<=n;i++) {
            int a=i*i;
            if(a==n) cnt++;
            for(int j=i;a+j*j<=n;j++) {
                int b=a+j*j;
                if(b==n) cnt++;
                for(int k=j;b+k*k<=n;k++) {
                    int c=b+k*k;
                    if(c==n) cnt++;
                    for(int l=k;c+l*l<=n;l++) {
                        int d=c+l*l;
                        if(d==n) cnt++;
                    }
                }
            }
        }
        cout << cnt << '\n';
    }
}
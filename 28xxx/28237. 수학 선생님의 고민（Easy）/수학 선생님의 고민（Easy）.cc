#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;

    for(int a=1;a*a<=n;a++) {
        if(n%a==0) {
            int c=n/a;
            for(int b=1;b*b<=n+2;b++) {
                if((n+2)%b==0) {
                    int d=(n+2)/b;
                    if(-a*d+b*c==n+1) {
                        cout << a << ' ' << b << ' ' << c << ' ' << -d;
                        return 0;
                    }
                    if(a*d-b*c==n+1) {
                        cout << a << ' ' << -b << ' ' << c << ' ' << d;
                        return 0;
                    }
                    if(a*b-c*d==n+1) {
                        cout << a << ' ' << -d << ' ' << c << ' ' << b;
                        return 0;
                    }
                    if(-a*b+c*d==n+1) {
                        cout << a << ' ' << d << ' ' << c << ' ' << -b;
                        return 0;
                    }
                }
            }
        }
    }
    cout << -1;
}
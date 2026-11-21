#include<bits/stdc++.h>
using namespace std;

bool isPrime(int a) {
    if(a<=1) return false;
    for(int i=2;i*i<=a;i++) {
        if(a%i==0) {
            return false;
        }
    }
    return true;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int P; cin >> P;
    while(P-->0) {
        int a, b; cin >> a >> b;
        cout << a << ' ' << b;

        if(!isPrime(b)) {
            cout << " NO\n";
            continue;
        }

        set<int> s; s.insert(b);
        while(true) {
            int tmp=0;
            while(b!=0) {
                tmp += pow(b%10, 2);
                b/=10;
            }

            if(tmp==1) {
                cout << " YES\n";
                break;
            }
            if(s.count(tmp)) {
                cout << " NO\n";
                break;
            }
            b=tmp;
            s.insert(b);
        }
    }
}
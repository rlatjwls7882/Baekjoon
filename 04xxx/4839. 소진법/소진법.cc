#include<bits/stdc++.h>
using namespace std;

bool isSosu(int n) {
    for(int i=2;i*i<=n;i++) {
        if(n%i==0) return false;
    }
    return true;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    while(true) {
        int n; cin >> n;
        if(!n) break;
        cout << n << " = ";

        long long mult=1;
        vector<int> sosu;
        for(int i=2;n;i++) {
            if(isSosu(i)) {
                mult*=i;
                if(n%mult) {
                    cout << n%mult/(mult/i);
                    for(int e:sosu) cout << '*' << e;
                    n-=n%mult;
                    if(n) cout << " + ";
                }
                sosu.push_back(i);
            }
        }
        cout << '\n';
    }
}
#include<bits/stdc++.h>
using namespace std;

int gcd(int a, int b) {
    while(b!=0) {
        int tmp = a%b;
        a = b;
        b = tmp;
    }
    return a;
}

bool chk(int n) {
    for(int i=2;i*i<=n;i++) {
        if(n%i==0) {
            return false;
        }
    }
    return true;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int x, l, r; cin >> x >> l >> r;

    vector<int> v;
    for(int i=l;i<=r;i++) {
        if(i!=x && chk(gcd(x, i))) {
            v.push_back(i);
        }
    }

    cout << v.size() << '\n';
    for(int val:v) {
        cout << val << ' ';
    }
}
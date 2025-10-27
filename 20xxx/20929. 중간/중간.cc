#include<bits/stdc++.h>
using namespace std;

const int MAX = 2<<20;

int n, minMid, a[MAX], b[MAX];

void init() {
    cout << "? A " << n << '\n' << flush;
    cin >> a[n];
    cout << "? B " << n << '\n' << flush;
    cin >> b[n];
    minMid = min(a[n], b[n]);
}

void chk(int l, int r) {
    cout << "? A " << l << '\n' << flush;
    cin >> a[l];
    cout << "? B " << r << '\n' << flush;
    cin >> b[r];
    minMid = min(minMid, max(a[l], b[r]));
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n;
    init();

    if(n>1) {
        int l=n/2, r=n/2;
        chk(l, r);
        for(int mv=n/4;mv>=1;mv/=2) {
            if(a[l]<b[r]) {
                l += mv;
                r -= mv;
            } else {
                l -= mv;
                r += mv;
            }
            chk(l, r);
        }
    }
    cout << "! " << minMid << '\n' << flush;
}
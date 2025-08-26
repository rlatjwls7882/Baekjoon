#include<bits/stdc++.h>
using namespace std;

int appear[11];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    double total=0;
    for(int i=0;i<n;i++) {
        int b; cin >> b;
        total += 1.0/(b+1);
        appear[b]++;
    }

    if(1-0.0000001<=total && total<=1+0.0000001) {
        for(int i=1;i<=10;i++) {
            if(appear[i]>1) {
                cout << 0;
                return 0;
            }
        }
        cout << 1;
    } else if(total<1) {
        cout << 1;
    } else {
        cout << 0;
    }
}
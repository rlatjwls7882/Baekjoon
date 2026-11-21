#include<bits/stdc++.h>
using namespace std;

int mit[13];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    mit[0]=5;
    for(int i=1;i<13;i++) mit[i] = mit[i-1]*5;

    int t; cin >> t;
    while(t--) {
        int n; cin >> n;
        for(int i=0;i<13;i++) {
            if(mit[i]>=n) {
                cout << "MIT";
                if(i) cout << "^" << i+1;
                cout << " time\n";
                break;
            }
        }
    }
}

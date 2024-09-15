#include <bits/stdc++.h>

using namespace std;

int koo=1, cube=0;
int winner[1000001] = {cube, };

int main(void) {
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    for(int i=1;i<=1000000;i++) {
        for(int j=1;j*j<=i;j++) {
            if(winner[i-j*j]==cube) {
                winner[i]=koo;
                break;
            }
        }
    }

    int t; cin >> t;
    while(t-->0) {
        int n; cin >> n;
        if(winner[n]==koo) {
            cout << "koosaga\n";
        } else {
            cout << "cubelover\n";
        }
    }
}
#include<bits/stdc++.h>
using namespace std;

bool chk[40001];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t-->0) {
        int M, N, x, y; cin >> M >> N >> x >> y;
        memset(chk, false, sizeof(chk));

        for(int i=x;;i+=M) {
            if((i-1)%N+1==y) {
                cout << i << '\n';
                break;
            }
            if(chk[(i-1)%N+1]) {
                cout << "-1\n";
                break;
            }
            chk[(i-1)%N+1]=true;
        }
    }
}
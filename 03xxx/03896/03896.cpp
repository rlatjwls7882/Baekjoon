#include<bits/stdc++.h>
using namespace std;

const int MAX = 1299709;
int notSosu[MAX+1] = {true, false, };

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    for(int i=2;i*i<=MAX;i++) {
        if(!notSosu[i]) {
            for(int j=i*i;j<=MAX;j+=i) {
                notSosu[j]=true;
            }
        }
    }

    int t; cin >> t;
    while(t-->0) {
        int n; cin >> n;
        if(!notSosu[n]) {
            cout << "0\n";
        } else {
            int cnt=2;
            for(int i=n-1;i>2;i--) {
                if(!notSosu[i]) break;
                cnt++;
            }
            for(int i=n+1;i<MAX;i++) {
                if(!notSosu[i]) break;
                cnt++;
            }
            cout << cnt << '\n';
        }
    }
}
#include <bits/stdc++.h>

using namespace std;

int dp[21][21][21] = {0, };

int w(int a, int b, int c) {
    if(a<=0 || b<=0 || c<=0) {
        return 1;
    }
    if(dp[a][b][c]==0) {
        if(a<b&&b<c) {
            dp[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
        } else {
            dp[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
        }
    }
    return dp[a][b][c];
}

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    while(true) {
        int a, b, c; cin >> a >> b >> c;
        if(a==-1 && b==-1 && c==-1) {
            break;
        }
        if(a<=0 || b<=0 || c<=0) {
            cout << "w(" << a << ", " << b << ", " << c << ") = 1" << endl;
        } else if(a>20 || b>20 || c>20) {
            cout << "w(" << a << ", " << b << ", " << c << ") = " << w(20, 20, 20) << endl;
        } else {
            cout << "w(" << a << ", " << b << ", " << c << ") = " << w(a, b, c) << endl;
        }
    }
}
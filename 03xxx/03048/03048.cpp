#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N1, N2; cin >> N1 >> N2;
    string a, b; cin >> a >> b;
    int T; cin >> T;

    int startN1=0;
    int startN2=N1-T;

    for(int i=-50;i<N1+N2;i++) {
        if(startN2<=i&&i<startN2+N2) cout << b[i-startN2];
        if(startN1<=i&&i<startN1+N1) cout << a[N1-1-i-startN1];
    }
}
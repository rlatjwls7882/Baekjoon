#include<bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int X, S; cin >> X >> S;

    int _max=0;
    while(N-->0) {
        int c, p; cin >> c >> p;
        if(c<=X) {
            _max = max(_max, p);
        }
    }

    if(_max>S) {
        cout << "YES";
    } else {
        cout << "NO";
    }
}
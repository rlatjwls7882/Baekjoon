#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int t; cin >> t;

    while(t-->0) {
        int N; cin >> N;
        if(N==1) {
            cout << 0;
        } else {
            cout << 1;
            for(int i=0;i<N-2;i++) {
                cout << 2;
            }
            cout << 1;
        }
        cout << endl;
    }
}
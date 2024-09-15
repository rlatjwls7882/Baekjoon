#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int K; cin >> K;
    for(int i=0;i<3*K;i++) {
        for(int j=0;j<4*K;j++) {
            if(i<K && j<K) {
                cout << 'G';
            } else if(K<=i && i<2*K && K<=j && j<2*K) {
                cout << 'I';
            } else if(K<=i && i<2*K && 3*K<=j) {
                cout << 'T';
            } else if(2*K<=i && 2*K<=j && j<3*K) {
                cout << 'S';
            } else {
                cout << '.';
            }
        }
        cout << '\n';
    }
}
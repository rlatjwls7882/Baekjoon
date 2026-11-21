#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int n; cin >> n;

    int A=0, B=0;
    while(n-->0) {
        int weight; cin >> weight;
        if(A<=B) {
            A += weight;
        } else {
            B += weight;
        }
    }

    int diff = abs(A-B), cnt=0;
    int w[] = {100, 50, 20, 10, 5, 2, 1};
    for(int i=0;i<7;i++) {
        cnt += diff/w[i];
        diff %= w[i];
    }
    cout << cnt;
}
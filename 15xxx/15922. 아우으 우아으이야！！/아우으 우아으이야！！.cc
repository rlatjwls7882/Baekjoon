#include<bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    int sum=0, first=-1000000000, last=-1000000000;
    while(N-->0) {
        int x, y; cin >> x >> y;
        if(last<x) {
            sum += last-first;
            first=x;
            last=y;
        } else {
            last = max(last, y);
        }
    }
    sum += last-first;
    cout << sum;
}
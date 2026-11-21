#include<bits/stdc++.h>
using namespace std;

bool isSquareByTwo(int n) {
    while(n%2==0) n>>=1;
    return n!=1;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        int n; cin >> n;
        cout << (isSquareByTwo(n) ? "Gazua\n" : "GoHanGang\n");
    }
}
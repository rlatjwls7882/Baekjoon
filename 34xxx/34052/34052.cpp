#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int sum=0;
    for(int i=0;i<4;i++) {
        int input; cin >> input;
        sum += input;
    }
    cout << (sum+300<=1800 ? "Yes" : "No");
}
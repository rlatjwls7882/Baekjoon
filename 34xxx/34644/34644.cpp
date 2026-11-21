#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int val;
    for(int i=0;i<100;i++) cin >> val;
    cout << (val-1)%10+1;
}
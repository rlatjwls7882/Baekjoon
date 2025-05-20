#include<bits/stdc++.h>
using namespace std;

int getNum(int x) {
    int sum=0, cur=1;
    for(int i=0;i<x;i++) {
        sum += cur;
        cur *= 10;
    }
    return sum;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int x, y; cin >> x >> y;
    cout << getNum(x) + getNum(y);
}
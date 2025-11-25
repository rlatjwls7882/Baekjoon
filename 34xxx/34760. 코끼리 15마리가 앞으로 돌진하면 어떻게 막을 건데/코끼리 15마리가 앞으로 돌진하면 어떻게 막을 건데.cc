#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int maxVal=0, idx;
    for(int i=1;i<=15;i++) {
        int a; cin >> a;
        if(maxVal<a) {
            maxVal=a;
            idx=i;
        }
    }
    if(idx!=15) maxVal++;
    cout << maxVal;
}
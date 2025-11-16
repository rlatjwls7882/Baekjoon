#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    string s; cin >> s;

    int k=0, p=0;
    for(char ch:s) {
        if(ch=='K') {
            if(p) p--;
            k++;
        } else {
            if(k) k--;
            p++;
        }
    }
    cout << k+p;
}
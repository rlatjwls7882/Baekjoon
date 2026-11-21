#include<bits/stdc++.h>
using namespace std;

typedef unsigned long long ull;

void find(int d) {
    ull input=1;
    while(d-->1) input*=10;
    for(int i=1990;i<=9000;i++) {
        ull cur=1;
        for(int j=9000;j>=1;j-=i) cur*=j;
        if(cur<=input) {
            cout << "IT'S OVER 9000";
            for(int j=0;j<i;j++) cout << '!';
            cout << '\n';
            return;
        }
    }
    cout << "...\n";
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    for(int tc=1;tc<=t;tc++) {
        int d; cin >> d;
        cout << "Case #" << tc << ": ";
        find(d);
    }
}
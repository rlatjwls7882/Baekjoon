#include<bits/stdc++.h>
using namespace std;

int main() {
    int n=1, maxVal=0;
    while(true) {
        cout << "? 1 " << n << '\n';
        string s; cin >> s;
        if(s[0]=='A') break;
        else {
            maxVal = max(maxVal, stoi(s));
            n++;
        }
    }

    for(int i=2;i<n;i++) {
        for(int j=1;j<n;j++) {
            cout << "? " << i << ' ' << j << '\n';
            string s; cin >> s;
            maxVal = max(maxVal, stoi(s));
        }
    }
    cout << "! " << maxVal;
}
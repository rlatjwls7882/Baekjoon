#include<bits/stdc++.h>
using namespace std;

string s[50];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    int total=0;
    for(int i=0;i<n;i++) {
        cin >> s[i];
        for(int j=0;j<n;j++) {
            if(s[i][j]=='C') total++;
        }
    }

    int cnt=0;
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            if(cnt<total/2) {
                if(s[i][j]=='C') cnt++;
                cout << 1;
            } else {
                cout << 2;
            }
        }
        cout << '\n';
    }
}
#include<bits/stdc++.h>
using namespace std;

int a[100];
vector<string> s(100);

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) cin >> a[i];
    for(int i=0;i<n;i++) cin >> s[i];

    for(int i=0;i<3;i++) {
        vector<string> beforeS(100);
        for(int j=0;j<n;j++) beforeS[j] = s[a[j]-1];
        s = beforeS;
    }
    for(int i=0;i<n;i++) cout << s[i] << '\n';
}
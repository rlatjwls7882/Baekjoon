#include<bits/stdc++.h>
using namespace std;
int main() {
    int n; string s; cin >> n >> s;
    for(int i=0;i+3<n;i++) {
        if(s[i]=='g' && s[i+1]=='o' && s[i+2]=='r' && s[i+3]=='i') {
            cout << "YES";
            return 0;
        }
    }
    cout << "NO";
}
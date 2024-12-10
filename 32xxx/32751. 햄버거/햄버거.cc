#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, arr[4]; string s; cin >> n;
    for(int i=0;i<4;i++) cin >> arr[i];
    cin >> s;
    for(int i=0;i<s.length();i++) arr[s[i]-'a']--;
    for(int i=0;i<4;i++) {
        if(arr[i]<0) {
            cout << "No";
            return 0;
        }
    }
    if(s[0]!='a' || s[s.length()-1]!='a') {
        cout << "No";
        return 0;
    }
    for(int i=1;i<s.length();i++) {
        if(s[i]==s[i-1]) {
            cout << "No";
            return 0;
        }
    }
    cout << "Yes";
}
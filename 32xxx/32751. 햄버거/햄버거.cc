#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    int arr[4];
    for(int i=0;i<4;i++) cin >> arr[i];
    string s; cin >> s;
    
    bool good=true;
    for(int i=0;i<s.length();i++) if(--arr[s[i]-'a']<0) good=false;
    if(s[0]!='a' || s[s.length()-1]!='a') good=false;
    for(int i=1;i<s.length();i++) if(s[i]==s[i-1]) good=false;

    if(good) cout << "Yes";
    else cout << "No";
}
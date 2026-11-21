#include<bits/stdc++.h>
using namespace std;

bool equalIgnoreCase(string a, string b) {
    if(a.length()!=b.length() || b=="null") return false;
    for(int i=0;i<a.length();i++) {
        if(a[i]!=b[i] && a[i]-32!=b[i] && a[i]!=b[i]-32) return false;
    }
    return true;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    string a, b; cin >> a >> b;
    if(a=="null") cout << "NullPointerException\nNullPointerException";
    else cout << (a==b ? "true\n" : "false\n") << (equalIgnoreCase(a, b) ? "true" : "false");
}
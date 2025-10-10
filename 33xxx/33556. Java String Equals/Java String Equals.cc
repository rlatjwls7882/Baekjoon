#include<bits/stdc++.h>
using namespace std;

bool equalsIgnoreCase(string a, string b) {
    if(a.length()!=b.length() || b=="null") return false;
    for(int i=0;i<a.length();i++) {
        if(a[i]>='a') a[i]-=32;
        if(b[i]>='a') b[i]-=32;
        if(a[i]!=b[i]) return false;
    }
    return true;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    string a, b; cin >> a >> b;
    if(a=="null") cout << "NullPointerException\nNullPointerException";
    else cout << (a==b ? "true\n" : "false\n") << (equalsIgnoreCase(a, b) ? "true" : "false");
}
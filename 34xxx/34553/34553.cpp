#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    string s; cin >> s;

    int sum=1, last=1;
    for(int i=1;i<s.length();i++) {
        if(s[i]>s[i-1]) last++;
        else last=1;
        sum += last;
    }
    cout << sum;
}
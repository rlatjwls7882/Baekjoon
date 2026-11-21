#include<bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string s1, s2; cin >> s1 >>s2;
    if(s1.length()<s2.length()) {
        string tmp=s1;
        s1=s2;
        s2=tmp;
    }

    int _min=INT_MAX;
    for(int i=0;i<=s1.length()-s2.length();i++) {
        int cnt=0;
        for(int j=0;j<s2.length();j++) {
            if(s1[i+j]!=s2[j]) {
                cnt++;
            }
        }
        _min = min(_min, cnt);
    }
    cout << _min;
}
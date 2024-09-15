#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    string s; cin >> s;

    vector<char> v;
    int cnt0=0, cnt1=0;
    for(char ch:s) {
        v.push_back(ch);
        if(ch=='1') {
            cnt1++;
        } else {
            cnt0++;
        }
    }
    cnt0/=2; cnt1/=2;

    for(int i=0;cnt1>0;) {
        if(v[i]=='1') {
            v.erase(v.begin()+i);
            cnt1--;
        } else {
            i++;
        }
    }

    for(int i=v.size()-1;cnt0>0;i--) {
        if(v[i]=='0') {
            v.erase(v.begin()+i);
            cnt0--;
        }
    }

    for(char ch:v) {
        cout << ch;
    }
}
#include<bits/stdc++.h>
using namespace std;

void getMax(string s) {
    int last=0;
    for(int i=0;i<s.length();i++) {
        if(s[i]=='K') {
            cout << '5';
            for(int j=last;j<i;j++) cout << '0';
            last=i+1;
        }
    }
    if(last!=s.length()) {
        for(int i=last;i<s.length();i++) cout << '1';
    }
    cout << '\n';
}

void getMin(string s) {
    int last=0;
    for(int i=0;i<s.length();i++) {
        if(s[i]=='K') {
            if(last!=i) {
                cout << '1';
                for(int j=last+1;j<i;j++) cout << '0';
            }
            cout << '5';
            last=i+1;
        }
    }
    if(last!=s.length()) {
        cout << '1';
        for(int i=last+1;i<s.length();i++) cout << '0';
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    string s; cin >> s;
    getMax(s);
    getMin(s);
}
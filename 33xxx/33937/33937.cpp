#include<bits/stdc++.h>
using namespace std;

string a, b;

void chk() {
    int aIdx=-1;
    for(int i=0;i<a.length();i++) {
        if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u') {
            aIdx=i;
            break;
        }
    }
    if(aIdx==-1) {
        cout << "no such exercise";
        return;
    }
    while(++aIdx<a.length()) {
        if(!(a[aIdx]=='a' || a[aIdx]=='e' || a[aIdx]=='i' || a[aIdx]=='o' || a[aIdx]=='u')) {
            break;
        }
    }
    if(aIdx>a.length()) {
        cout << "no such exercise";
        return;
    }

    int bIdx=-1;
    for(int i=0;i<b.length();i++) {
        if(b[i]=='a' || b[i]=='e' || b[i]=='i' || b[i]=='o' || b[i]=='u') {
            bIdx=i;
            break;
        }
    }
    if(bIdx==-1) {
        cout << "no such exercise";
        return;
    }
    while(++bIdx<b.length()) {
        if(!(b[bIdx]=='a' || b[bIdx]=='e' || b[bIdx]=='i' || b[bIdx]=='o' || b[bIdx]=='u')) {
            break;
        }
    }

    if(aIdx>=a.length() || bIdx>=b.length()) {
        cout << "no such exercise";
        return;
    }

    for(int i=0;i<aIdx;i++) cout << a[i];
    for(int i=0;i<bIdx;i++) cout << b[i];
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> a >> b;
    chk();
}
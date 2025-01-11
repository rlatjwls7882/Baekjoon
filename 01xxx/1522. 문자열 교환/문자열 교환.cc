#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    string s; cin >> s;

    int size=0;
    for(int i=0;i<s.length();i++) {
        if(s[i]=='a') size++;
    }

    int minCnt=size;
    s += s;
    for(int i=0;i+size<=s.length();i++) {
        int curCnt=0;
        for(int j=i;j<i+size;j++) {
            if(s[j]=='b') curCnt++;
        }
        minCnt = min(minCnt, curCnt);
    }
    cout << minCnt;
}
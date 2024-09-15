#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int K; cin >> K;
    string s; cin >> s;

    char last='N';
    int maxLength=0, lastLength=0, curLength=0;
    for(int i=0;i<s.length();i++) {
        if(s[i]==last) {
            curLength++;
        } else {
            maxLength = max(maxLength, min(lastLength, curLength)*2);
            lastLength=curLength;
            curLength=1;
            last=s[i];
        }
    }
    maxLength = max(maxLength, min(lastLength, curLength)*2);

    cout << maxLength;
}
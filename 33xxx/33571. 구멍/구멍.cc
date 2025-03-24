#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    string s; getline(cin, s);
    
    int cnt=0;
    for(char ch:s) {
        if(ch=='A' || ch=='a' || ch=='b' || ch=='D' || ch=='d' || ch=='e' || ch=='g' || ch=='O' || ch=='o' || ch=='P' || ch=='p' || ch=='Q' || ch=='q' || ch=='R' || ch=='@') cnt++;
        else if(ch=='B') cnt+=2;
    }
    cout << cnt;
}
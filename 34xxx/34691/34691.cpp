#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    while(true) {
        string s; cin >> s;
        if(s[0]=='a') cout << "Panthera tigris\n";
        else if(s[0]=='f') cout << "Forsythia koreana\n";
        else if(s[0]=='t') cout << "Pinus densiflora\n";
        else break;
    }
}
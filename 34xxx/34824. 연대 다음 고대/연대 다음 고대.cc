#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    while(n--) {
        string s; cin >> s;
        if(s=="yonsei") {
            cout << "Yonsei Won!";
            return 0;
        } else if(s=="korea") {
            cout << "Yonsei Lost...";
            return 0;
        }
    }
}
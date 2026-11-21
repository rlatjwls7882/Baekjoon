#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int sh, sm, eh, em; char ch; cin >> sh >> ch >> sm >> eh >> ch >> em;
    if(sh<eh || sh==eh && sm<em) cout << "YES";
    else cout << "NO";
}
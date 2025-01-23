#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    priority_queue<int, vector<int>, greater<int>> Sajang, Ju;
    for(int i=0;i<n;i++) {
        int inp; cin >> inp;
        Ju.push(inp);
    }
    for(int i=0;i<n;i++) {
        int inp; cin >> inp;
        Sajang.push(inp);
    }

    int cnt=0;
    while(!Sajang.empty()) {
        if(Ju.top()<Sajang.top()) {
            cnt++;
            Ju.pop();
            Sajang.pop();
        } else {
            Sajang.pop();
        }
    }
    if(cnt>n/2) cout << "YES";
    else cout << "NO";
}
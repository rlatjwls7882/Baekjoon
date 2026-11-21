#include<bits/stdc++.h>
using namespace std;

string a, b;
unordered_map<string, string> parent;

int chk() {
    string tmp = a;
    while(parent.count(tmp)) {
        tmp = parent[tmp];
        if(tmp==b) return 1;
    }

    tmp = b;
    while(parent.count(tmp)) {
        tmp = parent[tmp];
        if(tmp==a) return 1;
    }
    return 0;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n-1;i++) {
        cin >> a >> b;
        parent[a]=b;
    }
    cin >> a >> b;
    cout << chk();
}
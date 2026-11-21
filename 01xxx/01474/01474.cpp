#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    vector<string> s(n);
    for(int i=0;i<n;i++) {
        cin >> s[i];
        m -= s[i].length();
    }

    int extra = m%(n-1);
    for(int i=0;i<n;i++) {
        if(i!=0) {
            for(int j=0;j<m/(n-1);j++) cout << '_';
            if(extra && (s[i][0]>='a' || n-i==extra)) cout << '_', extra--;
        }
        cout << s[i];
    }
}
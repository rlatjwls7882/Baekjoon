#include<bits/stdc++.h>
using namespace std;

bool chk(string a, string b) {
    int exchange[127];
    bool used[127];
    memset(used, false, sizeof(used));
    memset(exchange, -1, sizeof(exchange));
    for(int i=0;i<a.length();i++) {
        if(exchange[a[i]]!=-1 && exchange[a[i]]!=b[i] || exchange[a[i]]==-1 && used[b[i]]) return false;
        exchange[a[i]]=b[i];
        used[b[i]]=true;
    }
    return true;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    vector<string> s(n);
    for(int i=0;i<n;i++) cin >> s[i];

    int cnt=0;
    for(int i=0;i<n;i++) {
        for(int j=i+1;j<n;j++) {
            if(chk(s[i], s[j])) cnt++;
        }
    }
    cout << cnt;
}
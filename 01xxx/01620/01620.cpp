#include<bits/stdc++.h>
using namespace std;

string s[100'001];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, m; cin >> n >> m;

    map<string, int> maap;
    for(int i=1;i<=n;i++) {
        cin >> s[i];
        maap[s[i]]=i;
    }

    while(m--) {
        string in; cin >> in;
        if(in[0]<'A') cout << s[stoi(in)] << '\n';
        else cout << maap[in] << '\n';
    }
}
#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; string s; cin >> N >> s;

    cout << "smupc_";
    bool used[128] = {false, };
    vector<char> v;
    int cnt=4;
    for(int i=0;i<s.length();i++) {
        if(!used[s[i]]) {
            used[s[i]]=true;
            v.push_back(s[i]);
        } else {
            cnt++;
        }
    }
    string tmp = to_string(cnt);
    for(int i=tmp.length()-1;i>=0;i--) {
        cout << tmp[i];
    }

    for(int i=v.size()-1;i>=0;i--) {
        cout << v[i];
    }

    N += 1906;
    tmp = to_string(N);
    for(int i=3;i>=0;i--) {
        cout << tmp[i];
    }
}
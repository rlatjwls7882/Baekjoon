#include<bits/stdc++.h>
using namespace std;

bool comp(string a, string b) {
    return a.length() > b.length();
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N; cin >> N;
    vector<string> v(N);
    for(int i=0;i<N;i++) cin >> v[i];
    sort(v.begin(), v.end(), comp);

    vector<string> res;
    for(int i=0;i<N;i++) {
        bool chk=true;
        for(int j=0;j<res.size();j++) {
            if(res[j].substr(0, v[i].length()).compare(v[i])==0) {
                chk=false;
            }
        }
        if(chk) res.push_back(v[i]);
    }
    cout << res.size();
}
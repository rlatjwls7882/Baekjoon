#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    vector<vector<string>> v = vector<vector<string>>(N);
    for(int i=0;i<N;i++) {
        while(true) {
            string s; cin >> s;
            if(s.compare("-1")==0) break;
            
            if(v[i].empty()) v[i].push_back(s);
            else v[i].push_back(v[i].back()+"-1"+s);
        }
    }

    for(int i=0;;i++) {
        set<string> s;
        for(int j=0;j<N;j++) {
            if(v[j].size()==i) v[j].push_back(v[j].back()+"-10");
            s.insert(v[j][i]);
        }
        if(s.size()==N) {
            cout << i+1;
            break;
        }
    }
}
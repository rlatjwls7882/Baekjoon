#include<bits/stdc++.h>
using namespace std;

int comp(string a, string b) {
    int cnt=0;
    for(int i=0;i<4;i++) if(a[i]!=b[i]) cnt++;
    return cnt;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int T; cin >> T;
    while(T-->0) {
        int N; cin >> N;
        vector<string> v;
        map<string, int> cnt;
        for(int i=0;i<N;i++) {
            string cur; cin >> cur;
            if(++cnt[cur]<=3) v.push_back(cur);
        }

        int maxDiff=1000000;
        for(int i=0;i<v.size();i++) {
            for(int j=i+1;j<v.size();j++) {
                for(int k=j+1;k<v.size();k++) {
                    maxDiff = min(maxDiff, comp(v[i], v[j])+comp(v[j], v[k])+comp(v[i], v[k]));
                }
            }
        }
        cout << maxDiff << '\n';
    }
}
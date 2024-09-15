#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    map<char, int> m;
    while(N-->0) {
        string s; cin >> s;
        for(int i=0;i<s.length();i++) {
            m[s[i]]+=pow(10, s.length()-1-i);
        }
    }
    vector<int> v;
    for(auto a:m) {
        v.push_back(a.second);
    }
    sort(v.begin(), v.end(), greater<int>());
    
    int sum=0;
    for(int i=0;i<v.size();i++) {
        sum += v[i]*(9-i);
    }
    cout << sum;
}
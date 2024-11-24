#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N, M; cin >> N >> M;
    set<int> lenSet;
    vector<string> res;
    while(N-->0) {
        int maxLen=0, len=0;
        for(int i=0;i<M;i++) {
            char ch; cin >> ch;
            if(ch=='.') len++;
            else len=0;
            maxLen = max(maxLen, len);
        }
        string name; cin >> name;
        lenSet.insert(maxLen);
        res.push_back(to_string(maxLen)+" "+name+"\n");
    }
    cout << lenSet.size() << '\n';
    for(string e:res) cout << e;
}
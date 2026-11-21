#include<bits/stdc++.h>
using namespace std;

struct Trie {
    map<string, Trie*> m;

    void insert(string s, int start, int end) {
        if(start>end) return;
        string cur = s.substr(start, end-start+1); int idx=end+1;
        for(int i=start;i<end;i++) {
            if(s[i]=='\\') {
                cur = s.substr(start, i-start);
                idx=i+1;
                break;
            }
        }
        if(!m[cur]) m[cur] = new Trie;
        m[cur]->insert(s, idx, end);
    }

    void search(int depth) {
        for(auto p:m) {
            for(int i=0;i<depth;i++) cout << ' ';
            cout << p.first << '\n';
            p.second->search(depth+1);
        }
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    Trie* trie = new Trie;
    while(N-->0) {
        string s; cin >> s;
        trie->insert(s, 0, s.length()-1);
    }
    trie->search(0);
}
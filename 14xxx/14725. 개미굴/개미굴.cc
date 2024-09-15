#include<bits/stdc++.h>
using namespace std;

struct Trie {
    map<string, Trie*> go;

    void insert(int depth, int K, string s[]) {
        if(depth==K) return;
        if(!go[s[depth]]) go[s[depth]] = new Trie;
        go[s[depth]]->insert(depth+1, K, s);
    }

    void search(int depth) {
        for(auto p:go) {
            for(int i=0;i<depth;i++) cout << "--";
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
        int K; cin >> K;
        string s[K];
        for(int i=0;i<K;i++) {
            cin >> s[i];
        }
        trie->insert(0, K, s);
    }
    trie->search(0);
}
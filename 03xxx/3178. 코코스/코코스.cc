#include<bits/stdc++.h>
using namespace std;

int cnt=0;

struct Trie {
    vector<pair<char, Trie*>> go;
    void insert(string s, int depth) {
        if(!s[depth]) return;

        Trie *next;
        bool exist=false;
        for(auto p:go) {
            if(p.first == s[depth]) {
                exist=true;
                next = p.second;
                break;
            }
        }
        if(!exist) {
            cnt++;
            go.push_back({s[depth], new Trie});
            next = go.back().second;
        }
        next->insert(s, depth+1);
    }
};

string reverseOrder(string s) {
    for(int i=0;i<s.length()/2;i++) swap(s[i], s[s.length()-1-i]);
    return s;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, K; cin >> N >> K;

    // 왼쪽 절반은 순서대로 Trie, 오른쪽 절반은 역순으로 Trie
    Trie *leftHalf = new Trie;
    Trie *rightHalf = new Trie;
    while(N-->0) {
        string s; cin >> s;
        leftHalf->insert(s.substr(0, K), 0);
        rightHalf->insert(reverseOrder(s.substr(K, K)), 0);
    }
    cout << cnt;
}
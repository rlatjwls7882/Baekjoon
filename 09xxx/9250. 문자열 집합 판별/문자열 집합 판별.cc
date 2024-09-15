#include<bits/stdc++.h>
using namespace std;

struct Trie {
    Trie* go[26] = {0, };
    bool finish=false;
    Trie* fail;
    
    void insert(const char* s) {
        if(*s==0) {
            finish=true;
            return;
        }
        if(!go[*s-'a']) go[*s-'a'] = new Trie;
        go[*s-'a']->insert(s+1);
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    Trie* trie = new Trie;
    while(N-->0) {
        char s[101]; cin >> s;
        trie->insert(s);
    }
    
    queue<Trie*> q; q.push(trie);
    trie->fail = trie;
    while(!q.empty()) {
        Trie* cur = q.front(); q.pop();
        for(int i=0;i<26;i++) {
            if(!cur->go[i]) continue;
            Trie* next = cur->go[i];
            
            if(cur==trie) {
                next->fail = trie;
            } else {
                Trie* dest = cur->fail;
                while(dest!=trie && !(dest->go[i])) dest = dest->fail;
                if(dest->go[i]) dest = dest->go[i];
                next->fail = dest;
            }
            if(next->fail->finish) next->finish=true;
            q.push(next);
        }
    }
    
    int M; cin >> M;
    while(M-->0) {
        string s; cin >> s;
        Trie* cur = trie;
        for(int i=0;i<s.length();i++) {
            while(cur!=trie && !cur->go[s[i]-'a']) cur = cur->fail;
            if(cur->go[s[i]-'a']) cur = cur->go[s[i]-'a'];
            if(cur->finish) break;
        }
        if(cur->finish) cout << "YES\n";
        else cout << "NO\n";
    }
}
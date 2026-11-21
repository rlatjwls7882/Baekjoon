#include<bits/stdc++.h>
using namespace std;

struct Trie {
    Trie* go[128] = {0, };
    bool finish=false;
    Trie* fail;

    ~Trie() {
        for(int i=0;i<128;i++) delete go[i];
    }

    void insert(const char* s) {
        if(*s==0) {
            finish=true;
            return;
        }
        if(!go[*s]) go[*s] = new Trie;
        go[*s]->insert(s+1);
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    while(true) {
        int N, M; cin >> N >> M;
        if(N==0 && M==0) break;

        Trie* root = new Trie;
        while(N-->0) {
            char emo[16]; cin >> emo;
            root->insert(emo);
        }

        queue<Trie*> q; q.push(root);
        root->fail = root;
        while(!q.empty()) {
            Trie* cur = q.front(); q.pop();
            for(int i=0;i<128;i++) {
                if(!cur->go[i]) continue;
                Trie* next = cur->go[i];

                if(cur==root) {
                    next->fail = root;
                } else {
                    Trie* dest = cur->fail;
                    while(dest!=root && !dest->go[i]) dest = dest->fail;
                    if(dest->go[i]) dest = dest->go[i];
                    next->fail = dest;
                }
                if(next->fail->finish) next->finish=true;
                q.push(next);
            }
        }

        int cnt=0;
        cin.ignore();
        while(M-->0) {
            string s; getline(cin, s);
            Trie* cur = root;
            for(int i=0;i<s.length();i++) {
                while(cur!=root && !cur->go[s[i]]) cur = cur->fail;
                if(cur->go[s[i]]) cur = cur->go[s[i]];
                if(cur->finish) {
                    cnt++;
                    cur=root;
                }
            }
        }
        cout << cnt << '\n';
        delete root;
    }
}
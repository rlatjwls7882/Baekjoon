#include<bits/stdc++.h>
using namespace std;

struct Trie {
    vector<pair<char, Trie*>> go;
    // unordered_map<char, Trie*> go;
    int finish=0;
    Trie* fail;

    ~Trie() {
        go.clear();
    }

    void insert(const char* s, int len) {
        if(*s==0) {
            finish = max(len, finish);
            return;
        }

        Trie* next;
        bool chk=false;
        for(auto p:go) {
            if(p.first==*s) {
                next = p.second;
                chk=true;
                break;
            }
        }
        if(!chk) {
            go.push_back({*s, new Trie});
            next = go.back().second;
        }
        next->insert(s+1, len);
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; string tile; cin >> N >> tile;

    Trie* root = new Trie;
    int M; cin >> M;
    char s[5001];
    while(M-->0) {
        cin >> s;
        root->insert(s, strlen(s));
    }

    queue<Trie*> q; q.push(root);
    root->fail = root;
    while(!q.empty()) {
        Trie* cur = q.front(); q.pop();
        for(auto p:cur->go) {
            Trie* next = p.second;
            if(!next) continue;
            char ch = p.first;

            if(cur==root) {
                next->fail = root;
            } else {
                Trie* dest = cur->fail;
                while(dest!=root) {
                    bool chk=false;
                    for(auto p:dest->go) {
                        if(p.first==ch) {
                            chk=true;
                            break;
                        }
                    }
                    if(chk) break;
                    dest = dest->fail;
                }
                for(auto p:dest->go) {
                    if(p.first==ch) {
                        dest = p.second;
                        break;
                    }
                }
                next->fail = dest;
            }
            if(next->fail->finish) next->finish = max(next->finish, next->fail->finish);
            q.push(next);
        }
    }

    int chk[N+1] = {0, };
    Trie* cur = root;
    for(int i=0;i<N;i++) {
        while(cur!=root) {
            bool chk=false;
            for(auto p:cur->go) {
                if(p.first == tile[i]) {
                    chk=true;
                    break;
                }
            }
            if(chk) break;
            cur = cur->fail;
        }
        for(auto p:cur->go) {
            if(p.first == tile[i]) {
                cur = p.second;
                break;
            }
        }
        if(cur->finish) {
            chk[i+1]--;
            chk[i-cur->finish+1]++;
        }
    }

    int cnt=0;
    for(int i=0;i<N;i++) {
        chk[i+1] += chk[i];
        if(!chk[i]) cnt++;
    }
    cout << cnt;
    delete root;
}
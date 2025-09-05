#include<bits/stdc++.h>
using namespace std;

struct trie {
    vector<pair<char, trie*>> go;
    int finish=0;

    ~trie() {
        for(auto &e : go) delete e.second;
    }

    void insert(const char* ch) {
        if(!*ch) {
            finish++;
            return;
        }

        trie* next=0;
        for(auto g : go) {
            if(g.first==*ch) {
                next = g.second;
                break;
            }
        }
        if(!next) {
            go.push_back({*ch, new trie});
            next = go.back().second;
        }
        next->insert(ch+1);
    }

    int find(const char *ch) {
        if(!*ch) return finish;

        for(auto g : go) {
            if(g.first==*ch) {
                return g.second->find(ch+1);
            }
        }
        return 0;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        int n; cin >> n;
        vector<string> a(n);
        for(int i=0;i<n;i++) cin >> a[i];
        int k; cin >> k;
        vector<string> b(k);
        for(int i=0;i<k;i++) cin >> b[i];

        vector<int> res(k);
        int idx=0, len=10000;
        while(idx<n) {
            trie *root = new trie;
            for(int i=idx;i<min(idx+len, n);i++) {
                string s = a[i];
                set<string> strings;
                for(int blankLen=0;blankLen<=s.length();blankLen++) {
                    for(int blankIdx=0;blankIdx+blankLen<=s.length();blankIdx++) {
                        string left = s.substr(0, blankIdx);
                        string right = s.substr(blankIdx+blankLen, s.length()-(blankIdx+blankLen));
                        strings.insert(left+"*");
                        strings.insert("*"+right);
                        strings.insert(left+"*"+right);
                    }
                }
                for(string s : strings) root->insert(&s[0]);
            }
            for(int i=0;i<k;i++) res[i] += root->find(&b[i][0]);
            idx += len;
            delete root;
        }
        for(int e : res) cout << e << '\n';
    }
}
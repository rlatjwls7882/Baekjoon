#include<bits/stdc++.h>
using namespace std;

struct EERTREE {
    struct Node {
        int len=0, link=0, occ=0, pos=-1;
        array<int, 26> next{};
    };
    vector<Node> tree;
    string s="$";
    int last=1;
    EERTREE() {
        tree = {{-1}, {0}};
        tree[0].link = tree[1].link = 0;
    }
    int count() { return tree.size()-2; }
    string get(int v) { return s.substr(tree[v].pos-tree[v].len+1, tree[v].len); }

    int getLink(int v) {
        int i = s.size()-1;
        while(s[i-1-tree[v].len]!=s[i]) v = tree[v].link;
        return v;
    }

    int add(char ch) {
        s+=ch;
        int c = ch-'a';
        int cur = getLink(last);

        if(!tree[cur].next[c]) {
            int now = tree.size();
            tree.push_back({tree[cur].len+2});
            tree[now].pos = s.size()-1;
            tree[now].link = (tree[now].len==1 ? 1 : tree[getLink(tree[cur].link)].next[c]);
            tree[cur].next[c] = now;
        }
        last = tree[cur].next[c];
        tree[last].occ++;
        return last;
    }
    void add(string& str) { for(char c:str) add(c); }
    void build() { for(int i=tree.size()-1;i>=2;i--) tree[tree[i].link].occ+=tree[i].occ; }
};
EERTREE eertree;

int main() {
    cin.tie(0)->sync_with_stdio(0);
    string s; cin >> s;
    eertree.add(s);
    eertree.build();
    long long res=0;
    for(int i=1;i<eertree.tree.size();i++) res = max(res, eertree.tree[i].len*(long long)eertree.tree[i].occ);
    cout << res;
}
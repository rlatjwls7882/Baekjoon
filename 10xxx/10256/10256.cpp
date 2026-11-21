#include<bits/stdc++.h>
using namespace std;

struct Trie {
    Trie *go[26] = {0, };
    bool finish=false;
    Trie *fail;

    ~Trie() {
        for(int i=0;i<26;i++) delete go[i];
    }

    void insert(const char *s) {
        if(*s==0) {
            finish=true;
            return;
        }
        if(!go[*s-'A']) go[*s-'A'] = new Trie;
        go[*s-'A']->insert(s+1);
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int T; cin >> T;
    while(T-->0) {
        int n, m; cin >> n >> m;
        string A; char B[101]; cin >> A >> B;
        Trie *root = new Trie;
        root->insert(B);
        for(int i=0;i<m;i++) {
            for(int j=i+1;j<m;j++) {
                char nextB[101];
                for(int k=0;k<=100;k++) {
                    nextB[k]=B[k];
                }

                for(int k=0;k<(j-i+1)/2;k++) {
                    swap(nextB[i+k], nextB[j-k]);
                }
                root->insert(nextB);
            }
        }

        queue<Trie*> q; q.push(root);
        root->fail=root;
        while(!q.empty()) {
            Trie *cur = q.front(); q.pop();
            for(int i=0;i<26;i++) {
                if(!cur->go[i]) continue;
                Trie *next = cur->go[i];

                if(cur==root) {
                    next->fail=root;
                } else {
                    Trie *dest = cur->fail;
                    while(dest!=root && !dest->go[i]) dest = dest->fail;
                    if(dest->go[i]) dest = dest->go[i];
                    next->fail = dest;
                }
                if(next->fail->finish) next->finish=true;
                q.push(next);
            }
        }

        int cnt=0;
        Trie *cur = root;
        for(int i=0;i<n;i++) {
            while(cur!=root && !cur->go[A[i]-'A']) cur = cur->fail;
            if(cur->go[A[i]-'A']) cur = cur->go[A[i]-'A'];
            if(cur->finish) cnt++;
        }
        cout << cnt << '\n';
        delete root;
    }
}
#include<bits/stdc++.h>
#define MAX 536870912
using namespace std;

struct Trie {
    Trie* go[2] = {0, };
    int wordCnt=0;

    void insert(int x, int mod) {
        wordCnt++;
        if(mod==0) return;
        if(x>=mod) {
            if(!go[1]) go[1] = new Trie;
            go[1]->insert(x-mod, mod/2);
        } else {
            if(!go[0]) go[0] = new Trie;
            go[0]->insert(x, mod/2);
        }
    }

    void remove(int x, int mod) {
        wordCnt--;
        if(mod==0) return;
        if(x>=mod) {
            go[1]->remove(x-mod, mod/2);
            if(go[1]->wordCnt==0) go[1]=0;
        } else {
            go[0]->remove(x, mod/2);
            if(go[0]->wordCnt==0) go[0]=0;
        }
    }

    int search(int x, int mod) {
        if(mod==0) return 0;
        if(x>=mod) {
            if(go[0]) return mod + go[0]->search(x-mod, mod/2);
            else return go[1]->search(x-mod, mod/2);
        } else {
            if(go[1]) return mod + go[1]->search(x, mod/2);
            else return go[0]->search(x, mod/2);
        }
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int M; cin >> M;
    Trie* trie = new Trie;
    trie->insert(0, MAX);

    while(M-->0) {
        int a, x; cin >> a >> x;
        if(a==1) {
            trie->insert(x, MAX);
        } else if(a==2) {
            trie->remove(x, MAX);
        } else {
            cout << trie->search(x, MAX) << '\n';
        }
    }
}
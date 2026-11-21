#include<bits/stdc++.h>
#define MAX 1073741824
using namespace std;

struct Trie {
    Trie* go[2] = {0, };

    void insert(int x, int pow) {
        if(!pow) return;
        if(x>=pow) {
            if(!go[1]) go[1] = new Trie;
            go[1]->insert(x-pow, pow/2);
        } else {
            if(!go[0]) go[0] = new Trie;
            go[0]->insert(x, pow/2);
        }
    }

    int xor_max(int x, int pow) {
        if(!pow) return 0;
        if(x>=pow) {
            if(go[0]) return pow + go[0]->xor_max(x-pow, pow/2);
            else return go[1]->xor_max(x-pow, pow/2);
        } else {
            if(go[1]) return pow + go[1]->xor_max(x, pow/2);
            else return go[0]->xor_max(x, pow/2);
        }
    }
};


int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int T; cin >> T;
    while(T-->0) {
        Trie* trie = new Trie;
        trie->insert(0, MAX);
        int N; cin >> N;
        int xorMAX=0, preXor=0;
        while(N-->0) {
            int x; cin >> x;
            preXor ^= x;
            xorMAX = max(xorMAX, trie->xor_max(preXor, MAX));
            trie->insert(preXor, MAX);
        }
        cout << xorMAX << '\n';
    }
}
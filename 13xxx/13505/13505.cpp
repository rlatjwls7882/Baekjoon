#include<bits/stdc++.h>
#define MAX 536870912
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
        if(pow==0) return 0;
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
    int N; cin >> N;
    Trie* trie = new Trie;

    int maxVal=0;
    for(int i=0;i<N;i++) {
        int A; cin >> A;
        if(i!=0) maxVal = max(maxVal, trie->xor_max(A, MAX));
        trie->insert(A, MAX);
    }
    cout << maxVal;
}
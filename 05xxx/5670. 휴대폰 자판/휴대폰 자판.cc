#include<bits/stdc++.h>
using namespace std;

struct Trie {
    Trie* go[26] = {0, };
    int branch=0, wordCnt=0;

    ~Trie() {
        for(int i=0;i<26;i++) {
            if(go[i]) delete go[i];
        }
    }

    void insert(const char* cur) {
        if(*cur==0) {
            branch++;
            return;
        }
        if(!go[*cur-'a']) {
            go[*cur-'a'] = new Trie;
            branch++;
        }
        wordCnt++;
        go[*cur-'a']->insert(cur+1);
    }

    long long calcCnt(int depth) {
        long long ret=0;
        if(!depth || branch>=2) ret += wordCnt;
        for(int i=0;i<26;i++) {
            if(go[i]) ret += go[i]->calcCnt(depth+1); 
        }
        return ret;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cout.precision(2);
    cout << fixed;

    while(true) {
        int N; cin >> N;
        if(cin.fail()) break;

        Trie *trie = new Trie;
        for(int i=0;i<N;i++) {
            char s[81]; cin >> s;
            trie->insert(s);
        }
        cout << trie->calcCnt(0)/(double)N << '\n';
        delete trie;
    }
}
#include<bits/stdc++.h>
using namespace std;

map<int, int> mapFromTrie[2];

struct Trie {
    Trie* go[26] = {0, };
    int cnt=0;

    void add(const char* s) {
        cnt++;
        if(*s==0) return;
        if(!go[*s-'a']) go[*s-'a'] = new Trie;
        go[*s-'a']->add(s+1);
    }

    void del(const char* s) {
        cnt--;
        if(*s==0) return;
        go[*s-'a']->del(s+1);
        if(go[*s-'a']->cnt==0) go[*s-'a']=0;
    }

    void find(const char* s, int curLen, int idx) {
        mapFromTrie[idx][curLen]=cnt;
        if(*s==0 || !go[*s-'a']) return;
        go[*s-'a']->find(s+1, curLen+1, idx);
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int Q; cin >> Q;

    Trie* A = new Trie;
    Trie* B = new Trie;
    while(Q-->0) {
        string a; cin >> a;
        if(a.compare("add")==0) {
            char b; char c[1001]; cin >> b >> c;
            if(b=='A') A->add(c);
            else {
                int len = strlen(c);
                for(int i=0;i<len/2;i++) {
                    swap(c[i], c[len-1-i]);
                }
                B->add(c);
            }
        } else if(a.compare("delete")==0) {
            char b; char c[1001]; cin >> b >> c;
            if(b=='A') A->del(c);
            else {
                int len = strlen(c);
                for(int i=0;i<len/2;i++) {
                    swap(c[i], c[len-1-i]);
                }
                B->del(c);
            }
        } else {
            char c[1001]; cin >> c;
            mapFromTrie[0].clear();
            mapFromTrie[1].clear();
            A->find(c, 0, 0);
            int len = strlen(c);
            for(int i=0;i<len/2;i++) {
                swap(c[i], c[len-1-i]);
            }
            B->find(c, 0, 1);
            
            int sum=0;
            for(int i=1;i<len;i++) {
                sum += mapFromTrie[0][i] * mapFromTrie[1][len-i];
            }
            cout << sum << '\n';
        }
    }
}
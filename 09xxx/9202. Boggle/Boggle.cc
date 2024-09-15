#include<bits/stdc++.h>
using namespace std;

int score;
string s[4], emptyString="", maxString;
set<string> stringSet;
bool visited[4][4] = {false, };
int moveX[8] = {1, 1, 1, 0, 0, -1, -1, -1};
int moveY[8] = {-1, 0, 1, -1, 1, -1, 0, 1};

struct Trie {
    Trie* go[26] = {0, };
    bool finish=false;

    void insert(string key, int idx) {
        if(key.length() == idx) {
            finish=true;
            return;
        }
        if(!go[key[idx]-'A']) go[key[idx]-'A'] = new Trie;
        go[key[idx]-'A']->insert(key, idx+1);
    }
};

void dfs(Trie* cur, int curX, int curY, string word) {
    visited[curX][curY]=true;
    if(!stringSet.count(word) && cur->finish) {
        stringSet.insert(word);
        if(word.length()==8) score += 11;
        else if(word.length()==7) score += 5;
        else if(word.length()==6) score += 3;
        else if(word.length()==5) score += 2;
        else if(word.length()>=3) score += 1;
        if(maxString.length()<word.length() || maxString.length()==word.length() && maxString.compare(word)>0) {
            maxString = word;
        }
    }
    for(int i=0;i<8;i++) {
        int nextX = curX+moveX[i];
        int nextY = curY+moveY[i];
        if(nextX<0 || nextX>=4 || nextY<0 || nextY>=4 || !cur->go[s[nextX][nextY]-'A'] || visited[nextX][nextY]) continue;
        dfs(cur->go[s[nextX][nextY]-'A'], nextX, nextY, word+s[nextX][nextY]);
    }
    visited[curX][curY]=false;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int w; cin >> w;
    Trie *root = new Trie;
    while(w-->0) {
        string tmp; cin >> tmp;
        root->insert(tmp, 0);
    }

    int b; cin >> b;
    for(int i=0;i<b;i++) {
        for(int j=0;j<4;j++) {
            cin >> s[j];
        }

        score=0;
        stringSet.clear();
        maxString="";
        for(int j=0;j<4;j++) {
            for(int k=0;k<4;k++) {
                if(root->go[s[j][k]-'A']) {
                    dfs(root->go[s[j][k]-'A'], j, k, emptyString+s[j][k]);
                }
            }
        }
        cout << score << ' ' << maxString << ' ' << stringSet.size() << '\n';
    }
}
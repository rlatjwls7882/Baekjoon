#include<bits/stdc++.h>
using namespace std;

int L, C;
vector<char> ch;
char arr[15];

void dfs(int depth, int start, int consonant, int vowel) {
    if(depth==L) {
        if(consonant>=2 && vowel>=1) {
            for(int i=0;i<L;i++) {
                cout << arr[i];
            }
            cout << '\n';
        }
        return;
    }

    for(int i=start;i<C;i++) {
        arr[depth]=ch[i];

        if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u') dfs(depth+1, i+1, consonant, vowel+1);
        else dfs(depth+1, i+1, consonant+1, vowel);
    }
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> L >> C;

    for(int i=0;i<C;i++) {
        char tmp; cin >> tmp;
        ch.push_back(tmp);
    }
    sort(ch.begin(), ch.end());

    dfs(0, 0, 0, 0);
}
#include<bits/stdc++.h>
using namespace std;

const int MAX = 100'000;

// front[i] : i 문자를 앞부분으로 했을때 뒤에 잘리는 최소 개수
// back[i] : i 문자를 뒷부분으로 했을때 앞에 잘리는 최소 개수
int front[26], back[26];
int curFront[26], curBack[26];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    fill(front, front+26, MAX);
    fill(back, back+26, MAX);

    int minCnt=MAX;
    int n; cin >> n;
    for(int i=0;i<n;i++) {
        string s; cin >> s;
        fill(curFront, curFront+26, MAX);
        fill(curBack, curBack+26, MAX);

        for(int i=0;i<s.length();i++) {
            curFront[s[i]-'a'] = s.length()-1-i;
            curBack[s[i]-'a'] = min(curBack[s[i]-'a'], i);
        }

        for(int i=0;i<26;i++) {
            minCnt = min(minCnt, curFront[i]+back[i]);
            minCnt = min(minCnt, front[i]+curBack[i]);
            front[i] = min(front[i], curFront[i]);
            back[i] = min(back[i], curBack[i]);
        }
    }
    cout << (minCnt == MAX ? -1 : minCnt);
}
#include<bits/stdc++.h>
using namespace std;

int score[100];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    for(int i=0;i<n;i++) cin >> score[i];

    int maxId, maxScore=-1;
    while(m--) {
        int id; cin >> id;
        int curScore=0;
        for(int i=0;i<n;i++) {
            char ch; cin >> ch;
            if(ch=='O') curScore += score[i];
        }
        if(maxScore<=curScore) {
            if(maxScore==curScore) maxId = min(maxId, id);
            else maxId = id;
            maxScore = curScore;
        }
    }
    cout << maxId << ' ' << maxScore;
}
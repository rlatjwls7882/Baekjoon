#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, w; cin >> n >> w;

    int score=n*10;
    if(n>=3) score += 20;
    if(n==5) score += 50;
    if(w>1000) score = max(0, score-15);
    cout << score;
}
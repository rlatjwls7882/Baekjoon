#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M, X, Y; cin >> N >> M >> X >> Y;
    int Hscore; cin >> Hscore >> Hscore;
    vector<int> score;
    while(N-->1) {
        int a, b; cin >> a >> b;
        if(a/1000000==2024) score.push_back(b + max(Y-(X-b), 0));
    }
    sort(score.begin(), score.end(), greater<int>());
    if(score.size()<M) cout << "YES\n0";
    else if(score[M-1]-Hscore>Y) cout << "NO";
    else {
        cout << "YES\n";
        cout << max(0, score[M-1]-Hscore);
    }
}
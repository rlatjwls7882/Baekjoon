#include <bits/stdc++.h>
using namespace std;

bool visited[3001][3001] = {false, };

struct HT {
    int H, T, cost;
    HT(int H, int T, int cost) {
        this->H=H;
        this->T=T;
        this->cost=cost;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, K; cin >> N >> K;
    string s; cin >> s;

    int H=0, T=0;
    for(int i=0;i<s.length();i++) {
        if(s[i]=='H') H++;
        else T++;
    }

    queue<HT> q; q.push(HT(H, T, 0));
    visited[H][T]=true;
    while(!q.empty()) {
        HT cur = q.front(); q.pop();
        if(cur.H==0) {
            cout << cur.cost;
            return 0;
        }

        for(int i=0;i<=K;i++) {
            HT next = HT((cur.H-i)+K-i, (cur.T-(K-i))+i, cur.cost+1);
            if(cur.H<i || cur.T<K-i || visited[next.H][next.T]) continue;
            visited[next.H][next.T]=true;
            q.push(next);
        }
    }
    cout << -1;
}
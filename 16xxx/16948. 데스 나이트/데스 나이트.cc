#include<bits/stdc++.h>
using namespace std;
typedef tuple<int, int, int> T;

bool visited[200][200] = {false, };
int moveR[6] = {-2, -2, 0, 0, 2, 2};
int moveC[6] = {-1, 1, -2, 2, -1, 1};

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int r1, c1, r2, c2; cin >> r1 >> c1 >> r2 >> c2;

    queue<T> q; q.push(T(r1, c1, 0));
    visited[r1][c1] = true;
    while(!q.empty()) {
        T cur = q.front(); q.pop();
        if(get<0>(cur)==r2 && get<1>(cur)==c2) {
            cout << get<2>(cur);
            return 0;
        }

        for(int i=0;i<6;i++) {
            T next = make_tuple(get<0>(cur)+moveR[i], get<1>(cur)+moveC[i], get<2>(cur)+1);
            if(get<0>(next)<0 || get<0>(next)>=N || get<1>(next)<0 || get<1>(next)>=N || visited[get<0>(next)][get<1>(next)]) continue;
            visited[get<0>(next)][get<1>(next)]=true;
            q.push(next);
        }
    }
    cout << -1;
}
#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    vector<tuple<int, int, int>> input;
    for(int i=0;i<N;i++) {
        int T, A, B; cin >> T >> A >> B;
        input.push_back({T, A, B});
    }
    sort(input.begin(), input.end());

    int lastT=0;
    int canGo[2001] = {0, }; // -1000~1000
    canGo[1000]=1;
    for(auto tu:input) {
        int T = get<0>(tu), A = get<1>(tu), B = get<2>(tu);

        int move = T-lastT;
        int nextGo[2001] = {0, };
        for(int i=0;i<=2000;i++) {
            if(canGo[i]) {
                for(int j=i-move;j<=i+move;j++) {
                    if(j<=A+1000 || j>=B+1000) {
                        if(nextGo[j]==0) nextGo[j] = canGo[i] + abs(j-i);
                        else nextGo[j] = min(nextGo[j], canGo[i] + abs(j-i));
                    }
                }
            }
        }
        memcpy(&canGo, &nextGo, sizeof(canGo));
        lastT=T;
    }

    int minMove = INT_MAX;
    for(int i=0;i<=2000;i++) {
        if(canGo[i]!=0) minMove = min(minMove, canGo[i]);
    }

    if(minMove == INT_MAX) cout << -1;
    else cout << minMove-1;
}
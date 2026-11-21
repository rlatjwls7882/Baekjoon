#include<bits/stdc++.h>
using namespace std;

bool visited[1000001][10] = {false, };

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string N; int K; cin >> N >> K;

    int maxVal=0;
    queue<pair<string, int>> q; q.push({N, 0});
    while(!q.empty()) {
        pair<string, int> cur = q.front(); q.pop();
        if(cur.second==K) {
            maxVal = max(maxVal, stoi(cur.first));
            continue;
        }

        for(int i=0;i<N.length();i++) {
            for(int j=i+1;j<N.length();j++) {
                if(!(i==0 && cur.first[j]=='0')) {
                    swap(cur.first[i], cur.first[j]);
                    if(!visited[stoi(cur.first)][cur.second]) {
                        q.push({cur.first, cur.second+1});
                        visited[stoi(cur.first)][cur.second]=true;
                    }
                    swap(cur.first[i], cur.first[j]);
                }
            }
        }
    }
    if(maxVal==0) cout << -1;
    else cout << maxVal;
}
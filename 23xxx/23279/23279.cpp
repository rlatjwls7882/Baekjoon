#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, K; cin >> N >> K;
    vector<queue<int>> group(K);
    for(int i=0;i<K;i++) {
        int C; cin >> C;
        int tmp[C];
        for(int j=0;j<C;j++) {
            cin >> tmp[j];
        }
        sort(tmp, tmp+C);
        for(int val:tmp) {
            group[i].push(val);
        }
    }

    vector<vector<int>> res(K);
    int cnt[K] = {0, };
    for(int i=1;i<=N;i++) {
        int idx=0;
        for(;idx<K;idx++) {
            if(!group[idx].empty() && group[idx].front()==cnt[idx]) {
                res[idx].push_back(i);
                group[idx].pop();
                break;
            }
        }
        for(int j=0;j<K;j++) {
            if(idx!=j) {
                cnt[j]++;
            }
        }
    }

    for(auto row:res) {
        for(auto val:row) {
            cout << val << ' ';
        }
        cout << '\n';
    }
}
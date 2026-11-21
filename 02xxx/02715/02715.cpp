#include<bits/stdc++.h>
using namespace std;

int state[30];

void flip(int idx) {
    for(int i=0;i<idx/2;i++) swap(state[i], state[idx-1-i]);
    for(int i=0;i<idx;i++) state[i]*=-1;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    while(n--) {
        int m; cin >> m;
        for(int i=0;i<m;i++) cin >> state[i];

        vector<int> res;
        for(int i=m;i>=1;i--) {
            int idx=0;
            for(int j=0;j<i;j++) {
                if(abs(state[j])==i) idx=j;
            }
            if(idx==i-1 && state[idx]==i) continue;
            if(idx) {
                res.push_back(idx+1);
                flip(idx+1);
            }
            if(state[0]>0) {
                res.push_back(1);
                state[0]*=-1;
            }
            res.push_back(i);
            flip(i);
        }
        cout << res.size();
        for(int e:res) cout << ' ' << e;
        cout << '\n';
    }
}
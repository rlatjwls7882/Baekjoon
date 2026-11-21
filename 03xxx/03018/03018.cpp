#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, E; cin >> N >> E;
    vector<set<int>> v = vector<set<int>>(N+1);

    int cnt=0;
    while(E-->0) {
        int k; cin >> k;

        bool Sonyong=false;
        int visitList[k];
        for(int i=0;i<k;i++) {
            cin >> visitList[i];
            if(visitList[i]==1) Sonyong=true;
        }

        if(Sonyong) {
            for(int ele:visitList) {
                v[ele].insert(cnt);
            }
            cnt++;
        } else {
            set<int> sum;
            for(int ele:visitList) {
                for(int setEle:v[ele]) {
                    sum.insert(setEle);
                }
            }

            for(int ele:visitList) {
                v[ele] = sum;
            }
        }
    }

    for(int i=1;i<=N;i++) {
        if(v[i].size()==cnt) {
            cout << i << '\n';
        }
    }
}
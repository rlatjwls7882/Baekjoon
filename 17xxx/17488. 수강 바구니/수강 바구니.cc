#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, m; cin >> n >> m;
    int remain[m];
    for(int i=0;i<m;i++) cin >> remain[i];
    
    vector<set<int>> result(n);
    for(int i=0;i<2;i++) {
        vector<set<int>> cur(m);
        for(int j=0;j<n;j++) {
            while(true) {
                int subjectIdx; cin >> subjectIdx;
                if(subjectIdx==-1) break;
                cur[subjectIdx-1].insert(j);
            }
        }
        for(int j=0;j<m;j++) {
            if(remain[j]>=cur[j].size()) {
                remain[j] -= cur[j].size();
                for(int personIdx:cur[j]) result[personIdx].insert(j+1);
            } else {
                remain[j]=0;
            }
        }
    }
    for(int i=0;i<n;i++) {
        if(result[i].empty()) cout << "망했어요\n";
        else {
            for(int subjectIdx:result[i]) cout << subjectIdx << ' ';
            cout << '\n';
        }
    }
}
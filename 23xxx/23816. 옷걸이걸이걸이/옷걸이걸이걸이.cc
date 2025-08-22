#include<bits/stdc++.h>
using namespace std;

const int MAX = 10'016;

int maxScore[MAX];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;

    memset(maxScore, -1, sizeof maxScore);
    maxScore[0]=0;

    for(int i=0;i<n;i++) {
        for(int j=m;j>=0;j--) {
            if(maxScore[j]!=-1) {
                maxScore[j+1] = max(maxScore[j+1], maxScore[j]+1);
                maxScore[j+3] = max(maxScore[j+3], maxScore[j]+2);
                maxScore[j+7] = max(maxScore[j+7], maxScore[j]+4);
                maxScore[j+15] = max(maxScore[j+15], maxScore[j]);
            }
        }
    }
    cout << maxScore[m];
}
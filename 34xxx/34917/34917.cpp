#include<bits/stdc++.h>
using namespace std;

char res[50][50];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int t; cin >> t;
    while(t--) {
        int n; cin >> n;
        fill(&res[0][0], &res[49][50], '.');
        for(int i=0;i<n;i++) res[i][0]=res[i][n-1]='#';
        for(int i=0;i<(n+1)/2;i++) {
            res[i][i]=res[i][n-1-i]='#';
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) cout << res[i][j];
            cout << '\n';
        }
    }
}
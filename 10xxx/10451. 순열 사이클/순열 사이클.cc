#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t; cin >> t;
    while(t-->0) {
        int n; cin >> n;
        int connect[n];
        for(int i=0;i<n;i++) {
            cin >> connect[i]; connect[i]--;
        }

        int cnt=0;
        bool visited[n] = {false, };
        for(int i=0;i<n;i++) {
            if(!visited[i]) {
                cnt++;
                for(int j=i;;j=connect[j]) {
                    if(visited[j]) break;
                    visited[j]=true;
                }
            }
        }
        cout << cnt << '\n';
    }
}
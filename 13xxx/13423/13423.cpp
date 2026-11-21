#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t-->0) {
        int n; cin >> n;
        vector<int> pos(n);
        for(int i=0;i<n;i++) cin >> pos[i];
        sort(pos.begin(), pos.end());

        int cnt=0;
        for(int a=0;a<pos.size();a++) {
            int b=a+1, c=a+2;
            while(c<pos.size()) {
                if(pos[b]-pos[a] == pos[c]-pos[b]) cnt++;
                if(pos[b]-pos[a] < pos[c]-pos[b]) b++;
                else c++;
            }
        }
        cout << cnt << '\n';
    }
}
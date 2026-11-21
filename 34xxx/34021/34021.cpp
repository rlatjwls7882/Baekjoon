#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        int n, m, l; cin >> n >> m >> l;
        
        int minTime = m;
        while(n--) {
            int time; cin >> time;
            if(time!=-1) minTime = min(minTime, time);
        }
        int remain = max(l, m-minTime);
        if(remain==1) cout << "The scoreboard has been frozen with 1 minute remaining.\n";
        else cout << "The scoreboard has been frozen with " << remain << " minutes remaining.\n";
    }
}
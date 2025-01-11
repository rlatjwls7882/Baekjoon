#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, t; cin >> n >> t;
    vector<int> frame, good(101);
    while(t-->0) {
        int cur; cin >> cur;
        if(++good[cur]==1 && frame.size()<n) {
            frame.push_back(cur);
        } else if(good[cur]==1) {
            int minVal=-1;
            for(int i=0;i<n;i++) {
                if(minVal==-1 || good[frame[minVal]]>good[frame[i]]) minVal=i;
            }
            good[frame[minVal]]=0;
            frame.erase(frame.begin()+minVal);
            frame.push_back(cur);
        }
    }
    sort(frame.begin(), frame.end());
    for(int e:frame) cout << e << ' ';
}
#include<bits/stdc++.h>
using namespace std;

int t, n, x[12];
vector<int> vis;
set<vector<int>, greater<vector<int>>> res;

void back(int depth=0, int sum=0, int cur=0) {
    if(sum==t) {
        res.insert(vis);
        return;
    }
    for(int i=cur;i<n;i++) {
        if(sum+x[i]<=t) {
            vis.push_back(x[i]);
            back(depth+1, sum+x[i], i+1);
            vis.pop_back();
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    while(true) {
        cin >> t >> n;
        for(int i=0;i<n;i++) cin >> x[i];
        if(!n) break;

        res = {};
        back();

        cout << "Sums of " << t <<":\n";
        if(res.empty()) {
            cout << "NONE\n";
        } else {
            for(auto elements : res) {
                for(int i=0;i<elements.size();i++) {
                    if(i!=0) cout << '+';
                    cout << elements[i];
                }
                cout << '\n';
            }
        }
    }
}
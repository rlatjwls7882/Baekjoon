#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    vector<int> mit; mit.push_back(5);
    for(int i=0;i<12;i++) mit.push_back(mit.back()*5);

    int t; cin >> t;
    while(t--) {
        int n; cin >> n;
        for(int i=0;i<mit.size();i++) {
            if(mit[i]>=n) {
                cout << "MIT";
                if(i) cout << "^" << i+1;
                cout << " time\n";
                break;
            }
        }
    }
}
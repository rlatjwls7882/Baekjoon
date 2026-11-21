#include<bits/stdc++.h>
using namespace std;

string permu = "ERSW";

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    vector<string> v(n);
    for(int i=0;i<n;i++) cin >> v[i];

    int minCnt = n;
    while(true) {
        vector<int> arr;
        for(int i=0;i<n;i++) {
            char ch = v[i][0];
            int w = stoi(v[i].substr(1));
            if(ch=='C') arr.push_back(5*(n+1)+w);
            else arr.push_back(permu.find(ch)*(n+1)+w);
        }

        vector<int> lis;
        for(int e:arr) {
            if(lis.empty() || lis.back()<e) lis.push_back(e);
            else lis[lower_bound(lis.begin(), lis.end(), e)-lis.begin()]=e;
        }
        minCnt = min(minCnt, n-(int)lis.size());
        if(!next_permutation(permu.begin(), permu.end())) break;
    }
    cout << minCnt;
}
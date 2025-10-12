#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    while(true) {
        int n; cin >> n;
        if(!n) break;
        vector<int> v(n);
        for(int i=0;i<n;i++) cin >> v[i];

        vector<vector<int>> aPlusB, dMinusC;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                aPlusB.push_back({v[i]+v[j], v[i], v[j]});
                dMinusC.push_back({v[i]-v[j], v[i], v[j]});
                dMinusC.push_back({v[j]-v[i], v[j], v[i]});
            }
        }
        sort(aPlusB.begin(), aPlusB.end());
        sort(dMinusC.begin(), dMinusC.end());

        int maxVal=INT_MIN, l=0, r=0;
        while(l<aPlusB.size() && r<dMinusC.size()) {
            if(aPlusB[l][0]==dMinusC[r][0] && aPlusB[l][1]!=dMinusC[r][1] && aPlusB[l][1]!=dMinusC[r][2] && aPlusB[l][2]!=dMinusC[r][1] && aPlusB[l][2]!=dMinusC[r][2]) {
                maxVal = max(maxVal, aPlusB[l][0]+dMinusC[r][2]);
                r++;
            }
            else if(aPlusB[l][0]<dMinusC[r][0]) l++;
            else r++;
        }
        cout << (maxVal==INT_MIN ? "no solution" : to_string(maxVal)) << '\n';
    }
}
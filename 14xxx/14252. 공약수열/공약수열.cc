#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    vector<int> v(n);
    for(int i=0;i<n;i++) cin >> v[i];
    sort(v.begin(), v.end());

    int cnt=0;
    for(int i=0;i<v.size()-1;i++) {
        if(gcd(v[i], v[i+1])!=1) {
            int notGcd=2, minVal = v[i]+1;
            for(int j=v[i]+1;j<v[i+1];j++) {
                int curNotGcd = (gcd(v[i], j)!=1) + (gcd(j, v[i+1])!=1);
                if(notGcd>curNotGcd) {
                    notGcd = curNotGcd;
                    minVal = j;
                }
            }
            if(notGcd==0) cnt++;
            else cnt += 2;
        }
    }
    cout << cnt;
}
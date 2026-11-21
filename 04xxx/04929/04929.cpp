#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    while(true) {
        int n; cin >> n;
        if(!n) break;

        map<int, int> idx;
        vector<int> a(n);
        for(int i=0;i<n;i++) {
            cin >> a[i];
            idx[a[i]]=i;
        }

        int sum=0, lastA=0, lastB=0;
        int m; cin >> m;
        vector<int> b(m);
        for(int i=0;i<m;i++) {
            cin >> b[i];
            if(idx.count(b[i])) {
                sum += max(accumulate(a.begin()+lastA, a.begin()+idx[b[i]]+1, 0), accumulate(b.begin()+lastB, b.begin()+i+1, 0));
                lastA = idx[b[i]]+1;
                lastB = i+1;
            }
        }
        if(lastA<n || lastB<m) sum += max(accumulate(a.begin()+lastA, a.end(), 0), accumulate(b.begin()+lastB, b.end(), 0));
        cout << sum << '\n';
    }
}
#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int a, b; cin >> a >> b;

    int cnt=0;
    for(int i=a;i<=b;i++) {
        string s = to_string(i);
        set<int> nextSet;
        for(int j=1;j<=s.length()-1;j++) {
            string nextS = s.substr(j, s.length()-j) + s.substr(0, j);
            int next = stoi(nextS);
            if(a<=next && next<=b && i<next && !nextSet.count(next)) {
                cnt++;
                nextSet.insert(next);
            }
        }
    }
    cout << cnt;
}
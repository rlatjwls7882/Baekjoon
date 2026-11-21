#include<bits/stdc++.h>
using namespace std;

bool used[1001];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    vector<int> res(n);
    for(int i=0;i<n;i++) {
        int cur=n;
        for(int j=0;j<n;j++) {
            int a; cin >> a;
            if(i!=j && !a || i==j && a) {
                cout << -1;
                return 0;
            }
            if(a==1) cur--;
        }
        if(used[cur]) {
            cout << -1;
            return 0;
        }
        used[cur]=true;
        res[i]=cur;
    }
    for(int i=0;i<n;i++) cout << res[i] << ' ';
}
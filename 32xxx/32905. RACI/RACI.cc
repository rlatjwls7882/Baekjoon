#include<bits/stdc++.h>
using namespace std;

int main() {
    int n, m; cin >> n >> m;
    for(int i=0;i<n;i++) {
        int cnt=0;
        for(int j=0;j<m;j++) {
            char ch; cin >> ch;
            if(ch=='A') cnt++;
        }
        if(cnt!=1) {
            cout << "No";
            return 0;
        }
    }
    cout << "Yes";
}
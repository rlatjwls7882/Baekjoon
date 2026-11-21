#include<bits/stdc++.h>
using namespace std;

const int MAX = 200'001;

bool chk[MAX];
int a[MAX], b[MAX*2];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) {
        cin >> a[i];
        chk[a[i]]=true;
    }
    for(int i=0;i<2*n;i++) cin >> b[i];

    for(int i=0;i<n;i++) {
        if(a[i]!=b[i]) {
            cout << "NO";
            return 0;
        }
    }
    for(int i=n;i<2*n;i++) {
        if(!chk[b[i]]) {
            cout << "NO";
            return 0;
        }
    }
    cout << "YES";
}
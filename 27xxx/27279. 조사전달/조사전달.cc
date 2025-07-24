#include<bits/stdc++.h>
using namespace std;

const int MAX = 100'002;
int a[MAX], b[MAX];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    for(int i=1;i<=n;i++) cin >> a[i];
    for(int i=1;i<=m;i++) cin >> b[i];
    sort(&b[1], &b[m+1]);

    // i는 최대 a[i]번째 깊이의 일까지 할 수 있음.
    for(int i=1;i<=n;i++) b[a[i]]--;

    // 그리디하게 배치 못하는 경우 "NO"
    for(int i=m;i>=1;i--) {
        if(b[i+1]<0) b[i] += b[i+1];
        if(b[i]>0) {
            cout << "NO";
            return 0;
        }
    }
    cout << "YES";
}
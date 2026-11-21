#include<bits/stdc++.h>
using namespace std;

int n, m, r;
int arr[300][300];

void rotate(int depth, int cnt) {
    cnt %= ((n-depth*2)*2+(m-depth*2-2)*2);

    while(cnt--) {
        int tmp = arr[depth][depth];
        for(int i=depth+1;i<m-depth;i++) arr[depth][i-1] = arr[depth][i];
        for(int i=depth+1;i<n-depth;i++) arr[i-1][m-depth-1] = arr[i][m-depth-1];
        for(int i=m-depth-2;i>=depth;i--) arr[n-depth-1][i+1] = arr[n-depth-1][i];
        for(int i=n-depth-2;i>=depth;i--) arr[i+1][depth] = arr[i][depth];
        arr[depth+1][depth] = tmp;
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> m >> r;
    for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) {
            cin >> arr[i][j];
        }
    }

    for(int i=0;i<min(n, m)/2;i++) {
        rotate(i, r);
    }

    for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) {
            cout << arr[i][j] << ' ';
        }
        cout << '\n';
    }
}
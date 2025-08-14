#include<bits/stdc++.h>
using namespace std;

int n, m;
int arr[8];
bool visited[8];

void back(int depth=0) {
    if(depth==m) {
        for(int i=0;i<m;i++) cout << arr[i] << ' ';
        cout << '\n';
        return;
    }

    for(int i=0;i<n;i++) {
        if(!visited[i]) {
            visited[i]=true;
            arr[depth]=i+1;
            back(depth+1);
            visited[i]=false;
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> m;
    back();
}
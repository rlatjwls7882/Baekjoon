#include<bits/stdc++.h>
using namespace std;

int K, _size, cnt=0;
int arr[1024];
vector<vector<int>> v = vector<vector<int>>(10);

void dfs(int pos, int depth) {
    if(pos*2<=_size) dfs(pos*2, depth+1);
    v[depth].push_back(arr[cnt++]);
    if(pos*2+1<=_size) dfs(pos*2+1, depth+1);
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> K;
    _size = pow(2, K)-1;
    for(int i=0;i<_size;i++) {
        cin >> arr[i];
    }
    dfs(1, 0);

    for(int i=0;i<K;i++) {
        for(int element:v[i]) {
            cout << element << ' ';
        }
        cout << '\n';
    }
}
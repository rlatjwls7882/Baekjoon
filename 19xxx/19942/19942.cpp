#include<bits/stdc++.h>
using namespace std;

int N, mp, mf, ms, mv;
int minCost=INT_MAX;
vector<int> minList;
int p=0, f=0, s=0, v=0;
vector<int> curList;
int arr[15][5];

void dfs(int depth, int start, int cost) {
    if(p>=mp && f>=mf && s>=ms && v>=mv) {
        if(minCost>cost) {
            minCost=cost;
            minList=curList;
        }
        return;
    }

    for(int i=start;i<N;i++) {
        curList.push_back(i);
        p+=arr[i][0]; f+=arr[i][1]; s+=arr[i][2]; v+=arr[i][3];
        dfs(depth+1, i+1, cost+arr[i][4]);
        p-=arr[i][0]; f-=arr[i][1]; s-=arr[i][2]; v-=arr[i][3];
        curList.pop_back();
    }
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> N >> mp >> mf >> ms >> mv;

    for(int i=0;i<N;i++) {
        for(int j=0;j<5;j++) {
            cin >> arr[i][j];
        }
    }
    dfs(0, 0, 0);

    if(minList.empty()) {
        cout << -1;
    } else {
        cout << minCost << '\n';
        for(int idx:minList) {
            cout << idx+1 << ' ';
        }
    }
}
#include<bits/stdc++.h>
using namespace std;

int k;
vector<int> weight(13);
bool available[2600001];

void back(int depth, int left, int right) {
    available[left]=available[right]=available[abs(left-right)]=true;
    if(depth==k) return;
    back(depth+1, left, right);
    back(depth+1, left+weight[depth], right);
    back(depth+1, left, right+weight[depth]);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> k;
    int S=0;
    for(int i=0;i<k;i++) {
        cin >> weight[i];
        S += weight[i];
    }
    back(0, 0, 0);

    int cnt=0;
    for(int i=1;i<=S;i++) {
        if(!available[i]) {
            cnt++;
        }
    }
    cout << cnt;
}
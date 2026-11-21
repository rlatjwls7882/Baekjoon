#include<bits/stdc++.h>
using namespace std;

int N, arr[20];
vector<bool> chk(20000000);

void back(int depth, int sum) {
    chk[sum]=true;
    if(depth==N) return;
    back(depth+1, sum);
    back(depth+1, sum+arr[depth]);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> N;
    for(int i=0;i<N;i++) cin >> arr[i];
    back(0, 0);

    for(int i=1;;i++) {
        if(!chk[i]) {
            cout << i;
            return 0;
        }
    }
}
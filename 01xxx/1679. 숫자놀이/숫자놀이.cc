#include <bits/stdc++.h>

using namespace std;

int N, K;
int arr[1000];
bool chk[50000];

void dfs(int depth, int sum, int start) {
    chk[sum]=true;
    if(depth==K) {
        return;
    }

    for(int i=start;i<N;i++) {
        dfs(depth+1, sum+arr[i], max(i, start));
    }
}

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    cin >> N;
    for(int i=0;i<N;i++) {
        cin >> arr[i];
    }
    cin >> K;
    dfs(0, 0, 0);

    int cnt=0;
    for(int i=1;;i++) {
        if(chk[i]) {
            cnt++;
        } else {
            if(cnt%2==0) {
                cout << "jjaksoon win at " << i;
            } else {
                cout << "holsoon win at " << i;
            }
            break;
        }
    }
}
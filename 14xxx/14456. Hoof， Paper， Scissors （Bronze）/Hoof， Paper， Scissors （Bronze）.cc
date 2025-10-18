#include<bits/stdc++.h>
using namespace std;

int beat[2][4] = {
    {0, 2, 3, 1},
    {0, 3, 1, 2},
};

int arr[100][2];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) cin >> arr[i][0] >> arr[i][1];

    int maxCnt=0;
    for(int i=0;i<2;i++) {
        int cnt=0;
        for(int j=0;j<n;j++) {
            if(beat[i][arr[j][0]]==arr[j][1]) cnt++;
        }
        maxCnt = max(maxCnt, cnt);
    }
    cout << maxCnt;
}
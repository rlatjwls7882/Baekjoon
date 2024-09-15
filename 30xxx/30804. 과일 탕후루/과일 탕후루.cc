#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int arr[N];
    for(int i=0;i<N;i++) {
        cin >> arr[i];
    }

    int maxCnt=0, type=0;
    int cnt[10] = {0, };
    int left=0, right=0;
    while(right<N) {
        if(type<=1 || type==2&&cnt[arr[right]]) {
            if(++cnt[arr[right++]]==1) type++;
            maxCnt = max(maxCnt, right-left);
        } else {
            if(--cnt[arr[left++]]==0) type--;
        }
    }
    cout << maxCnt;
}
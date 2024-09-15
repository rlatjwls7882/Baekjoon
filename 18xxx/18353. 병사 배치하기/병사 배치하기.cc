#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int arr[N];
    for(int i=0;i<N;i++) {
        cin >> arr[i];
    }

    int maxCnt=0;
    int cnt[N];
    for(int i=0;i<N;i++) {
        cnt[i]=1;
        for(int j=i-1;j>=0;j--) {
            if(arr[j]>arr[i]) {
                cnt[i] = max(cnt[i], cnt[j]+1);
            }
        }
        maxCnt = max(maxCnt, cnt[i]);
    }
    cout << N-maxCnt;
}
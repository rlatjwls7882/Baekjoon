#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int arr[N];
    for(int i=0;i<N;i++) cin >> arr[i];

    // 2개의 원소의 합 목록
    set<int> sum2;
    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            sum2.insert(arr[i]+arr[j]);
        }
    }

    // 최종값에서 하나를 뺀 값(두 원소의 합)이 있는지 확인
    int maxVal=0;
    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            if(sum2.count(arr[i]-arr[j])) maxVal = max(maxVal, arr[i]);
        }
    }
    cout << maxVal;
}
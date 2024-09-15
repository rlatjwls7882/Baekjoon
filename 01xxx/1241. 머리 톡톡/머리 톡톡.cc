#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    
    vector<int> cnt(1000001);
    int arr[N];
    for(int i=0;i<N;i++) {
        cin >> arr[i];
        cnt[arr[i]]++;
    }

    for(int i=0;i<N;i++) {
        int curCnt=-1;
        for(int j=1;j*j<=arr[i];j++) {
            if(arr[i]%j==0) {
                curCnt += cnt[j];
                if(j!=arr[i]/j) curCnt += cnt[arr[i]/j];
            }
        }
        cout << curCnt << '\n';
    }
}
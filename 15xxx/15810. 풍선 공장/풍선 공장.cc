#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    int arr[N];
    for(int i=0;i<N;i++) {
        cin >> arr[i];
    }

    long long first=1, last=1000000000000;
    while(first<last) {
        long long mid = (first+last)/2;

        long long cnt=0;
        for(int i=0;i<N;i++) {
            cnt += mid/arr[i];
        }

        if(cnt>=M) {
            last = mid;
        } else {
            first = mid+1;
        }
    }
    cout << last;
}
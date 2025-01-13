#include<bits/stdc++.h>
using namespace std;

int cnt[100001], A[200000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N, K; cin >> N >> K;
    for(int i=0;i<N;i++) cin >> A[i];

    int maxLen=0, left=0, right=0;
    while(right<N) {
        while(right<N && cnt[A[right]]<K) cnt[A[right++]]++;
        maxLen = max(maxLen, right-left);
        cnt[A[left++]]--;
    }
    cout << maxLen;
}
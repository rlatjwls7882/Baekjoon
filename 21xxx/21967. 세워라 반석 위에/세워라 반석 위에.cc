#include<bits/stdc++.h>
using namespace std;

int cnt[11];

bool chk() {
    int min=-1, max=-1;
    for(int i=1;i<=10;i++) {
        if(cnt[i]) {
            if(min==-1) min=i;
            max=i;
        }
    }
    return max-min<=2;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N; cin >> N;
    vector<int> A(N);
    for(int i=0;i<N;i++) cin >> A[i];

    int maxSize=0, first=0, last=0;
    while(last<N) {
        cnt[A[last++]]++;
        while(!chk()) {
            cnt[A[first++]]--;
        }
        maxSize = max(maxSize, last-first);
    }
    cout << maxSize;
}
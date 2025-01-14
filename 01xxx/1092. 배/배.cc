#include<bits/stdc++.h>
using namespace std;

int crain[50], box[10000], cnt[50];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N; cin >> N;
    for(int i=0;i<N;i++) cin >> crain[i];
    sort(crain, crain+N, greater<int>());

    int M; cin >> M;
    for(int i=0;i<M;i++) {
        cin >> box[i];
        if(box[i]>crain[0]) {
            cout << -1;
            return 0;
        }
    }
    sort(box, box+M, greater<int>());

    for(int i=0;i<M;i++) {
        int idx=0;
        for(int j=0;j<N;j++) {
            if(box[i]<=crain[j] && cnt[idx]>cnt[j]) {
                idx=j;
            }
        }
        cnt[idx]++;
    }
    cout << *max_element(cnt, cnt+N);
}
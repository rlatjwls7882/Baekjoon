#include<bits/stdc++.h>
using namespace std;

int parent[1000], cnt[1000];
int _find(int x) {
    if(parent[x]==x) return x;
    return parent[x] = _find(parent[x]);
}

void _union(int x, int y) {
    x = _find(x);
    y = _find(y);
    if(x<y) {
        parent[y]=x;
        cnt[x]+=cnt[y];
    } else {
        parent[x]=y;
        cnt[y]+=cnt[x];
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, K; cin >> N >> K;
    int A[N];
    for(int i=0;i<N;i++) {
        cin >> A[i];
    }

    for(int i=0;i<N;i++) {
        parent[i]=i;
        cnt[i]=1;
    }

    for(int i=1;i<N;i++) {
        if(A[i]-i*K<1) continue;
        for(int j=i-1;j>=0;j--) {
            if(A[i]-A[j]==K*(i-j)) {
                _union(i, j);
                break;
            }
        }
    }

    int maxCnt=1;
    for(int i=0;i<N;i++) {
        maxCnt = max(maxCnt, cnt[i]);
    }
    cout << N-maxCnt;
}
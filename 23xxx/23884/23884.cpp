#include<bits/stdc++.h>
using namespace std;

/** 
 * AToIdx[x] : x의 인덱스
 * idxToA[i] : i번 인덱스의 원소
 */
int idxToA[500'000]; 
map<int, int, greater<int>> AToIdx;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, k; cin >> n >> k;
    for(int i=0;i<n;i++) {
        int a; cin >> a;
        AToIdx[a]=i;
        idxToA[i]=a;
    }

    int last=n-1;
    while(k--) {
        if(!AToIdx.empty() && (*AToIdx.begin()).second==last) {
            last--;
            AToIdx.erase((*AToIdx.begin()).first);
        }
        if(AToIdx.empty()) {
            cout << -1;
            return 0;
        }

        int lastVal = idxToA[last];
        pair<int, int> front = *AToIdx.begin();

        swap(idxToA[last], idxToA[front.second]);
        swap(AToIdx[lastVal], front.second);
        last--;
        AToIdx.erase(front.first);
    }
    for(int i=0;i<n;i++) cout << idxToA[i] << ' ';
}
#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    long long x[N], y[N];
    for(int i=0;i<N;i++) cin >> x[i] >> y[i];
    
    // 두 점을 제외한 나머지 점으로 사각형 생성
    long long minSize = LONG_LONG_MAX;
    for(int i=0;i<N;i++) {
        for(int j=i+1;j<N;j++) {
            long long maxX = LONG_LONG_MIN, maxY = LONG_LONG_MIN;
            long long minX = LONG_LONG_MAX, minY = LONG_LONG_MAX;
            for(int k=0;k<N;k++) {
                if(k!=i && k!=j) {
                    maxX = max(maxX, x[k]+1);
                    maxY = max(maxY, y[k]+1);
                    minX = min(minX, x[k]-1);
                    minY = min(minY, y[k]-1);
                }
            }
            minSize = min(minSize, (long long)powl(max(maxX-minX, maxY-minY), 2));
        }
    }
    cout << minSize;
}
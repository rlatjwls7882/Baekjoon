#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, C; cin >> N >> C;
    int w[N];
    for(int i=0;i<N;i++) {
        cin >> w[i];
    }
    sort(w, w+N);

    for(int i=0;i<N;i++) {
        for(int j=i+1;j<N;j++) {
            if(w[i]==C || w[j]==C || w[i]+w[j]==C) {
                cout << 1;
                return 0;
            }

            int left=0, right=N-1;
            while(left<right) {
                int mid = (left+right)/2;

                if(w[i]+w[j]+w[mid]==C) {
                    if(i==mid || j==mid) break;
                    cout << 1;
                    return 0;
                }

                if(w[i]+w[j]+w[mid]<C) left=mid+1;
                else right=mid-1;
            }
        }
    }
    cout << 0;
}
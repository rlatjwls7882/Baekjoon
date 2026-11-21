#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    int pos[N];
    for(int i=0;i<N;i++) {
        cin >> pos[i];
    }
    sort(pos, pos+N);

    while(M-->0) {
        int s, e; cin >> s >> e;

        int first=0, last=N-1;
        while(first<last) {
            int mid = (first+last)/2;

            if(pos[mid]>=s) {
                last=mid;
            } else {
                first=mid+1;
            }
        }
        int sPos = first;

        first=0; last=N-1;
        while(first<last) {
            int mid = (first+last+1)/2;

            if(pos[mid]<=e) {
                first=mid;
            } else {
                last=mid-1;
            }
        }
        int ePos = first;
        
        if(e<pos[sPos] || s>pos[ePos]) {
            cout << "0\n";
        } else {
            cout << ePos-sPos+1 << '\n';
        }
    }
}
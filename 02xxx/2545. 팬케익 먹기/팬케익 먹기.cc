#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int T; cin >> T;
    while(T-->0) {
        long long arr[3], D; cin >> arr[0] >> arr[1] >> arr[2] >> D;
        while(D>0) {
            sort(arr, arr+3);
            if(arr[1]!=arr[2]) {
                long long cnt = min(D, arr[2]-arr[1]);
                arr[2] -= cnt;
                D -= cnt;
            } else if(arr[0]!=arr[1]) {
                long long cnt = min(D, (arr[1]-arr[0])*2);
                arr[1]-=cnt/2;
                arr[2]-=cnt/2;
                D-=cnt;
                if(cnt%2==1) arr[1]--;
            } else {
                long long cnt = D/3;
                arr[0]-=cnt;
                arr[1]-=cnt;
                arr[2]-=cnt;
                D-=cnt*3;
                if(D>=1) arr[1]--;
                if(D>=2) arr[2]--;
                D=0;
            }
        }
        cout << arr[0]*arr[1]*arr[2] << '\n';
    }
}
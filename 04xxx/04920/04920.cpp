#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    for(int i=1;;i++) {
        int N; cin >> N;
        if(N==0) break;

        int A[N][N];
        for(int j=0;j<N;j++) {
            for(int k=0;k<N;k++) {
                cin >> A[j][k];
            }
        }

        int sum = -10000000;
        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                if(i+3<N) sum = max(sum, A[i][j]+A[i+1][j]+A[i+2][j]+A[i+3][j]);
                if(j+3<N) sum = max(sum, A[i][j]+A[i][j+1]+A[i][j+2]+A[i][j+3]);

                if(i+1<N && j+2<N) sum = max(sum, A[i][j]+A[i][j+1]+A[i+1][j+1]+A[i+1][j+2]);
                if(i+2<N && j-1>=0) sum = max(sum, A[i][j]+A[i+1][j]+A[i+1][j-1]+A[i+2][j-1]);

                if(i+1<N && j+2<N) sum = max(sum, A[i][j]+A[i][j+1]+A[i][j+2]+A[i+1][j+2]);
                if(i+2<N && j-1>=0) sum = max(sum, A[i][j]+A[i+1][j]+A[i+2][j]+A[i+2][j-1]);
                if(i-1>=0 && j-2>=0) sum = max(sum, A[i][j]+A[i][j-1]+A[i][j-2]+A[i-1][j-2]);
                if(i-2>=0 && j+1<N) sum = max(sum, A[i][j]+A[i-1][j]+A[i-2][j]+A[i-2][j+1]);

                if(i+1<N && j+2<N) sum = max(sum, A[i][j]+A[i][j+1]+A[i][j+2]+A[i+1][j+1]);
                if(i+2<N && j-1>=0) sum = max(sum, A[i][j]+A[i+1][j]+A[i+2][j]+A[i+1][j-1]);
                if(i-1>=0 && j+2<N) sum = max(sum, A[i][j]+A[i][j+1]+A[i][j+2]+A[i-1][j+1]);
                if(i+2<N && j+1<N) sum = max(sum, A[i][j]+A[i+1][j]+A[i+2][j]+A[i+1][j+1]);

                if(i+1<N && j+1<N) sum = max(sum, A[i][j]+A[i][j+1]+A[i+1][j]+A[i+1][j+1]);
            }
        }
        cout << i << ". " << sum << '\n';
    }
}
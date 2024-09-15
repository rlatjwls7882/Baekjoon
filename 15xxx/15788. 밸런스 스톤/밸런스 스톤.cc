#include <bits/stdc++.h>

using namespace std;

long checkSum(long **block, int N, long sum) {
    // 가로 세로
    long diff=-1;
    for(int i=0;i<N;i++) {
        long sum1=0, sum2=0;
        bool blank1=false, blank2=false;
        for(int j=0;j<N;j++) {
            sum1 += block[i][j];
            sum2 += block[j][i];
            if(block[i][j]==0) {
                blank1=true;
            }
            if(block[j][i]==0) {
                blank2=true;
            }
        }

        if(blank1) {
            if(diff==-1) {
                diff = sum-sum1;
            } else if(diff!=sum-sum1) {
                return -1;
            }
        } else if(blank2) {
            if(diff==-1) {
                diff = sum-sum2;
            } else if(diff!=sum-sum2) {
                return -1;
            }
        } else if(sum1!=sum || sum2!=sum) {
            return -1;
        }
    }

    // 대각선
    long sum1=0, sum2=0;
    bool blank1=false, blank2=false;
    for(int i=0;i<N;i++) {
        sum1 += block[i][i];
        sum2 += block[N-1-i][i];
        if(block[i][i]==0) {
            blank1=true;
        }
        if(block[N-1-i][i]==0) {
            blank2=true;
        }
    }

    if(blank1&&diff!=sum-sum1 || blank2&&diff!=sum-sum2 || !blank1&&!blank2&&(sum1!=sum||sum2!=sum)) {
        return -1;
    }
    return diff;
}

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int N; cin >> N;

    long *block[N];
    int blankR, blankW;
    for(int i=0;i<N;i++) {
        block[i] = new long[N];
        for(int j=0;j<N;j++) {
            cin >> block[i][j];
            if(block[i][j]==0) {
                blankR=i;
                blankW=j;
            }
        }
    }

    long sum=0;
    int R = (blankR==N-1 ? 0 : N-1);
    for(int i=0;i<N;i++) {
        sum += block[R][i];
    }
    cout << checkSum(block, N, sum);
}
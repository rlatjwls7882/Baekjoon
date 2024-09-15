#include<bits/stdc++.h>
using namespace std;

int N, maxL=1;
string candy[50];
int moveX[4] = {1, -1, 0, 0};
int moveY[4] = {0, 0, 1, -1};

void chk() {
    for(int i=0;i<N;i++) {
        int len=1;
        for(int j=1;j<N;j++) {
            if(candy[i][j-1]==candy[i][j]) {
                maxL = max(maxL, ++len);
            } else {
                len=1;
            }
        }
    }
    for(int i=0;i<N;i++) {
        int len=1;
        for(int j=1;j<N;j++) {
            if(candy[j-1][i]==candy[j][i]) {
                maxL = max(maxL, ++len);
            } else {
                len=1;
            }
        }
    }
}

void swap(char* a, char* b) {
    char tmp = *a;
    *a = *b;
    *b = tmp;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> N;

    for(int i=0;i<N;i++) {
        cin >> candy[i];
    }

    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            for(int k=0;k<4;k++) {
                int nextX = i+moveX[k];
                int nextY = j+moveY[k];
                if(nextX<0 || nextX>=N || nextY<0 || nextY>=N || candy[i][j]==candy[nextX][nextY]) continue;
                swap(&candy[i][j], &candy[nextX][nextY]);
                chk();
                swap(&candy[i][j], &candy[nextX][nextY]);
            }
        }
    }
    cout << maxL;
}
#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    int arr[n][5];
    for(int i=0;i<n;i++) {
        for(int j=0;j<5;j++) {
            cin >> arr[i][j];
        }
    }

    int maxCnt=0, day1=0, day2=1;
    for(int chk1=0;chk1<5;chk1++) {
        for(int chk2=chk1+1;chk2<5;chk2++) {
            int curCnt=0;
            for(int i=0;i<n;i++) {
                if(arr[i][chk1] && arr[i][chk2]) {
                    curCnt++;
                }
            }
            if(curCnt>maxCnt) {
                maxCnt=curCnt;
                day1=chk1;
                day2=chk2;
            }
        }
    }

    cout << maxCnt << '\n';
    bool days[5] = {false, };
    days[day1]=days[day2]=true;
    for(int i=0;i<5;i++) {
        cout << days[i] << ' ';
    }
}
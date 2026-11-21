#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    int arr1[N];
    for(int i=0;i<N;i++) {
        cin >> arr1[i];
    }

    int arr2[N];
    for(int i=0;i<N;i++) {
        cin >> arr2[i];
    }

    int maxWin=0, curWin=0, lastWin=-1;
    for(int i=0;i<N;i++) {
        if(arr1[i]==arr2[i]) {
            if(lastWin==1) lastWin=2;
            else lastWin=1;
            curWin=1;
        } else if((arr1[i]+1)%3==arr2[i]%3) {
            if(lastWin==2) curWin++;
            else curWin=1;
            lastWin=2;
        } else {
            if(lastWin==1) curWin++;
            else curWin=1;
            lastWin=1;
        }
        maxWin = max(maxWin, curWin);
    }
    cout << maxWin;
}
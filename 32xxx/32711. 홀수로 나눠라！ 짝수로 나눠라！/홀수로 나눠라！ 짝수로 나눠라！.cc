#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N; cin >> N;

    int oddCnt=0, evenCnt=0, sum=0;
    for(int i=0;i<N;i++) {
        int cur; cin >> cur;
        sum += cur%2;
        if(cur%2==1) oddCnt++;
        if(sum%2==0) evenCnt++;
    }
    if(sum%2!=0) evenCnt=-1;

    if(oddCnt%2==1 || evenCnt>1) cout << 1;
    else cout << 0;
}
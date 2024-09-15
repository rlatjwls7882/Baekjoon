#include<bits/stdc++.h>
using namespace std;

int rotate(int i, int j, int k, int l) {
    int a[4] = {i, j, k, l};

    int val=9999;
    for(int i=0;i<4;i++) {
        val = min(val, a[i]*1000+a[(i+1)%4]*100+a[(i+2)%4]*10+a[(i+3)%4]);
    }
    return val;
}

int calc(int val) {
    int cnt=1;
    for(int i=1;i<=9;i++) {
        for(int j=i;j<=9;j++) {
            for(int k=1;k<=9;k++) {
                for(int l=1;l<=9;l++) {
                    if(i*1000+j*100+k*10+l<val && rotate(i, j, k, l)==i*1000+j*100+k*10+l) {
                        cnt++;
                    }
                }
            }
        }
    }
    return cnt;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int a[4];
    for(int i=0;i<4;i++) {
        cin >> a[i];
    }

    int val=rotate(a[0], a[1], a[2], a[3]);

    cout << calc(val);
}
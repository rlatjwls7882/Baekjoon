#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    int A[n], B[n], C[n], D[n];
    for(int i=0;i<n;i++) cin >> A[i] >> B[i] >> C[i] >> D[i];

    vector<int> Alist;
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            Alist.push_back(A[i]+B[j]);
        }
    }
    sort(Alist.begin(), Alist.end());

    vector<int> Blist;
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            Blist.push_back(C[i]+D[j]);
        }
    }
    sort(Blist.begin(), Blist.end());

    long long cnt=0, curALen=1, curBLen=1;
    int a=0, b=n*n-1;
    while(a<n*n && b>=0) {
        if(Alist[a]+Blist[b]==0) {
            while(a+1<n*n && Alist[a]==Alist[a+1]) {
                a++;
                curALen++;
            }
            while(b-1>=0 && Blist[b]==Blist[b-1]) {
                b--;
                curBLen++;
            }
            cnt += curALen*curBLen;
            curALen=curBLen=1;
            a++;
        } else if(Alist[a]+Blist[b]>0) {
            b--;
        } else {
            a++;
        }
    }
    cout << cnt;
}
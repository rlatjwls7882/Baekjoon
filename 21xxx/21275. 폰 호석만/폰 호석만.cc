#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string a, b; cin >> a >> b;

    int cntA=0, cntB=0;
    for(int i=0;i<a.length();i++) {
        if(a[i]<'a') cntA = max(cntA, a[i]-'0');
        else cntA = max(cntA, a[i]-'a'+10);
    }
    for(int i=0;i<b.length();i++) {
        if(b[i]<'a') cntB = max(cntB, b[i]-'0');
        else cntB = max(cntB, b[i]-'a'+10);
    }

    long long aToX[36] = {0, }, bToX[36] = {0, };
    for(int i=0;i<a.length();i++) {
        for(int j=cntA;j<36;j++) {
            if(aToX[j]>=0) {
                if(a[i]<'a') {
                    if(aToX[j]<=LONG_LONG_MAX/(j+1) && aToX[j]*(j+1)<=LONG_LONG_MAX-(a[i]-'0')) aToX[j] = aToX[j]*(j+1)+a[i]-'0';
                    else aToX[j]=-1;
                } else {
                    if(aToX[j]<=LONG_LONG_MAX/(j+1) && aToX[j]*(j+1)<=LONG_LONG_MAX-(a[i]-'a'+10)) aToX[j] = aToX[j]*(j+1)+a[i]-'a'+10;
                    else aToX[j]=-1;
                }
            }
        }
    }
    for(int i=0;i<b.length();i++) {
        for(int j=cntB;j<36;j++) {
            if(bToX[j]>=0) {
                if(b[i]<'a') {
                    if(bToX[j]<=LONG_LONG_MAX/(j+1) && bToX[j]*(j+1)<=LONG_LONG_MAX-(b[i]-'0')) bToX[j] = bToX[j]*(j+1)+b[i]-'0';
                    else bToX[j]=-2;
                } else {
                    if(bToX[j]<=LONG_LONG_MAX/(j+1) && bToX[j]*(j+1)<=LONG_LONG_MAX-(b[i]-'a'+10)) bToX[j] = bToX[j]*(j+1)+b[i]-'a'+10;
                    else bToX[j]=-2;
                }
            }
        }
    }

    long long X=-1, A, B;
    for(int i=cntA;i<36;i++) {
        for(int j=cntB;j<36;j++) {
            if(i!=j && aToX[i] == bToX[j]) {
                if(X!=-1) {
                    cout << "Multiple";
                    return 0;
                }
                X=aToX[i];
                A=i+1;
                B=j+1;
            }
        }
    }

    if(X==-1) {
        cout << "Impossible";
        return 0;
    }
    cout << X << ' ' << A << ' ' << B;
}
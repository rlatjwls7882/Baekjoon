#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t; cin >> t;
    while(t-->0) {
        int m; cin >> m;
        int left[m]; bool leftChk[m] = {false, };
        for(int i=0;i<m;i++) {
            cin >> left[i];
        }
        int right[m]; bool rightChk[m] = {false, };
        for(int i=0;i<m;i++) {
            cin >> right[i];
        }

        int cnt=0;
        for(int i=0;i<m;i++) {
            for(int j=i+1;j<m;j++) {
                if(!leftChk[i] && !leftChk[j] && left[i]+500==left[j]) {
                    for(int k=0;k<m;k++) {
                        if(!rightChk[k] && left[i]+1000==right[k]) {
                            for(int l=k+1;l<m;l++) {
                                if(!rightChk[l] && right[k]+500==right[l]) {
                                    leftChk[i]=leftChk[j]=rightChk[k]=rightChk[l]=true;
                                    cnt++;
                                }
                            }
                        }
                    }
                }
            }
        }
        cout << cnt << '\n';
    }
}
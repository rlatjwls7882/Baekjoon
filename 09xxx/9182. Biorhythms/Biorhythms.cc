#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    for(int caseNum=1;;caseNum++) {
        int p, e, i, d; cin >> p >> e >> i >> d;
        if(p==-1) break;

        for(int j=1;j<=21252;j++) {
            if((j-p)%23==0 && (j-e)%28==0 && (j-i)%33==0 && j>=d) {
                cout << "Case " << caseNum << ": the next triple peak occurs in " << j-d <<" days.\n";
                break;
            }
        }
    }
}
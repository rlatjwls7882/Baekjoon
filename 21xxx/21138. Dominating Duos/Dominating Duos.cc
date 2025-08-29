#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    int cnt=n-1;
    vector<int> lds;
    for(int i=0;i<n;i++) {
        int a; cin >> a;

        int popCnt=0;
        while(!lds.empty() && lds.back()<a) {
            popCnt++;
            lds.pop_back();
        }
        if(!lds.empty()) cnt += popCnt;
        else cnt += max(0, popCnt-1);
        lds.push_back(a);
    }
    cout << cnt;
}
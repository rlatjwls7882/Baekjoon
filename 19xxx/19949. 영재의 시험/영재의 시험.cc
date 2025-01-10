#include<bits/stdc++.h>
using namespace std;

int cnt=0;
vector<int> ans(10);

void back(int depth, int correct, int llast, int last) {
    if(depth==10) {
        if(correct>=5) cnt++;
        return;
    }
    for(int i=1;i<=5;i++) {
        if(!(llast==last && last==i)) {
            back(depth+1, correct + (ans[depth]==i), last, i);
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    for(int i=0;i<10;i++) cin >> ans[i];
    back(0, 0, 0, 0);
    cout << cnt;
}
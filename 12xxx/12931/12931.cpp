#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    int maxDepth=0, plusCnt=0;
    while(n--) {
        int val; cin >> val;
        int curDepth=0;
        while(val) {
            while(val%2==0) {
                val/=2;
                curDepth++;
            }
            val--;
            plusCnt++;
        }
        maxDepth = max(maxDepth, curDepth);
    }
    cout << maxDepth+plusCnt;
}
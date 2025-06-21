#include<bits/stdc++.h>
using namespace std;

map<int, int> stu;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    while(n--) {
        int Ki; cin >> Ki;
        while(Ki--) {
            int num; cin >> num;
            stu[num]++;
        }
    }

    int cnt=0;
    for(auto p : stu) {
        if(p.second>=m) cnt++;
    }
    cout << cnt;
}
#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    vector<int> time(n);
    for(int i=0;i<n;i++) cin >> time[i];
    sort(time.begin(), time.end());

    int left=1, right=1'000'000'000;
    while(left<right) {
        int mid = (left+right+1)/2;
        bool chk=true;
        for(int i=0;i<n;i++) {
            if((i+1)*mid>time[i]) {
                chk=false;
                break;
            }
        }
        if(chk) left = mid;
        else right = mid-1;
    }
    cout << left;
}
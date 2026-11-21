#include<bits/stdc++.h>
using namespace std;

int x[100000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, k; cin >> n >> k;
    for(int i=0;i<n;i++) cin >> x[i];
    
    int left=0, right=20000000;
    while(left<right) {
        int mid = (left+right+1)/2; // 각 그룹의 최솟값이 mid 이상이도록 그룹화
        int group=0, sum=0;
        for(int i=0;i<n;i++) {
            sum += x[i];
            if(sum>=mid) {
                group++;
                sum=0;
            }
        }
        if(group>=k) left=mid;
        else right=mid-1;
    }
    cout << left;
}
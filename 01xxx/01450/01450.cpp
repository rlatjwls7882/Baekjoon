#include <bits/stdc++.h>
using namespace std;

int n, c;
int arr[30];
map<int, int> cnt1, cnt2;
vector<int> num1, num2;

void dfs1(int start, int sum) {
    if(sum>c) return;
    if(++cnt1[sum]==1) num1.push_back(sum);

    for(int i=start;i<n/2;i++) {
        dfs1(i+1, sum+arr[i]);
    }
}

void dfs2(int start, int sum) {
    if(sum>c) return;
    if(++cnt2[sum]==1) num2.push_back(sum);

    for(int i=start;i<n;i++) {
        dfs2(i+1, sum+arr[i]);
    }
}

int main(){
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> n >> c;
    for(int i=0;i<n;i++) {
        cin >> arr[i];
    }
    dfs1(0, 0);
    dfs2(n/2, 0);

    sort(num2.begin(), num2.end());
    int sum2[num2.size()];
    sum2[0] = cnt2[num2[0]];
    for(int i=1;i<num2.size();i++) {
        sum2[i] = sum2[i-1] + cnt2[num2[i]];
    }

    int total=0;
    for(int sum1:num1) {
        int left=0, right=num2.size()-1;
        while(left<right) {
            int mid = (left+right+1)/2;
            if(num2[mid]+sum1<=c) left=mid;
            else right=mid-1;
        }
        if(num2[left]+sum1<=c) total += cnt1[sum1]*sum2[left];
    }
    cout << total;
}
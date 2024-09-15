#include <bits/stdc++.h>
using namespace std;

int n, s;
int arr[40];
long long total=0;
int cnt[6000001] = {0, };

void dfs1(int start, int sum) {
    cnt[sum+3000000]++;
    for(int i=start;i<n/2;i++) {
        dfs1(i+1, sum+arr[i]);
    }
}

void dfs2(int start, int sum) {
    total += cnt[s-sum+3000000];
    for(int i=start;i<n;i++) {
        dfs2(i+1, sum+arr[i]);
    }
}

int main(){
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> n >> s;
    for(int i=0;i<n;i++) {
        cin >> arr[i];
    }
    dfs1(0, 0);
    dfs2(n/2, 0);
    if(s==0) total--;
    cout << total;
}
#include<bits/stdc++.h>
using namespace std;

const int MAX = 1'000'001;
int arr[MAX], cnt[MAX], res[MAX];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=1;i<=n;i++) {
        cin >> arr[i];
        cnt[arr[i]]++;
    }

    stack<int> stk;
    for(int i=n;i>=1;i--) {
        while(!stk.empty() && cnt[stk.top()] <= cnt[arr[i]]) stk.pop();
        if(stk.empty()) res[i] = -1;
        else res[i] = stk.top();
        stk.push(arr[i]);
    }

    for(int i=1;i<=n;i++) cout << res[i] << ' ';
}
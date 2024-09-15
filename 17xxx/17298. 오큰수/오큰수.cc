#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int arr[N];
    for(int i=0;i<N;i++) {
        cin >> arr[i];
    }

    int idx[N];
    stack<int> stk;
    for(int i=N-1;i>=0;i--) {
        while(!stk.empty() && stk.top()<=arr[i]) {
            stk.pop();
        }
        if(stk.empty()) idx[i]=-1;
        else idx[i]=stk.top();
        stk.push(arr[i]);
    }

    for(int i=0;i<N;i++) {
        cout << idx[i] << ' ';
    }
}
#include<bits/stdc++.h>
using namespace std;

int N;
int A[20];
set<int> s;

void dfs(int start, int sum) {
    if(sum!=0) s.insert(sum);
    for(int i=start;i<N;i++) {
        dfs(i+1, sum+A[i]);
    }
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> N;
    int total=0;
    for(int i=0;i<N;i++) {
        cin >> A[i];
        total += A[i];
    }
    dfs(0, 0);
    cout << total - s.size();
}
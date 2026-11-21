#include<bits/stdc++.h>
using namespace std;

const int MAX = 10'000;
int prv[MAX], val[MAX];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        int n; cin >> n;
        memset(prv, 0, sizeof prv);

        vector<int> lis;
        for(int i=1;i<=n;i++) {
            cin >> val[i];
            if(lis.empty() || val[lis.back()]<val[i]) {
                if(!lis.empty()) prv[i] = lis.back();
                lis.push_back(i);
            } else {
                int left=0, right=lis.size()-1;
                while(left<right) {
                    int mid = (left+right)/2;
                    if(val[lis[mid]]<val[i]) left=mid+1;
                    else right=mid;
                }
                if(left!=0) prv[i] = lis[left-1];
                lis[left] = i;
            }
        }
        cout << lis.size() << '\n';
        stack<int> stk;
        for(int i=lis.back();i!=0;i=prv[i]) stk.push(i);
        while(!stk.empty()) {
            cout << stk.top() << ' '; stk.pop();
        }
        cout << '\n';
    }
}
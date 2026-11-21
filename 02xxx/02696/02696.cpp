#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        int n; cin >> n;
        priority_queue<int> min; // 작은 i+1개 (제일 큰게 top)
        priority_queue<int, vector<int>, greater<int>> max; // 큰 i개 (제일 작은게 top)

        cout << (n+1)/2;
        for(int i=0;i<n;i++) {
            int input; cin >> input;
            min.push(input);

            if(max.size()) {
                int top = max.top(); max.pop();
                min.push(top);
            }

            if((min.size()+max.size())%2==1) {
                while(min.size()!=max.size()+1) {
                    int top = min.top(); min.pop();
                    max.push(top);
                }
                if(i/2%10==0) cout << '\n';
                cout << min.top() << ' ';
            }
        }
        cout << '\n';
    }
}
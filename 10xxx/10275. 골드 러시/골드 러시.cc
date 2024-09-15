#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t; cin >> t;
    while(t-->0) {
        long long n, a, b; cin >> n >> a >> b;

        bitset<62> bitA = bitset<62>(a), bitB = bitset<62>(b);
        int left=-1, right;
        for(int i=0;i<62;i++) {
            if(bitA[i]) {
                if(left==-1) left=i;
                right=i;
            }
        }
        int maxLen1 = right-left+1;

        left=-1;
        for(int i=0;i<62;i++) {
            if(bitB[i]) {
                if(left==-1) left=i;
                right=i;
            }
        }
        int maxLen2 = right-left+1;
        cout << max(maxLen1, maxLen2) << '\n';
    }
}
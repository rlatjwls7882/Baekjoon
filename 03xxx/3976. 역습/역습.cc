#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int c; cin >> c;
    while(c-->0) {
        int n, l1, l2, s1, s2; cin >> n >> l1 >> l2 >> s1 >> s2;
        int pass1[n-1], dribble1[n-1];
        for(int i=0;i<n-1;i++) cin >> pass1[i];
        for(int i=0;i<n-1;i++) cin >> dribble1[i];
        int pass2[n-1], dribble2[n-1];
        for(int i=0;i<n-1;i++) cin >> pass2[i];
        for(int i=0;i<n-1;i++) cin >> dribble2[i];

        int last1=l1, last2=l2;
        for(int i=0;i<n-1;i++) {
            int cur1 = min(last1+dribble1[i], last2+pass2[i]);
            int cur2 = min(last2+dribble2[i], last1+pass1[i]);
            last1=cur1; last2=cur2;
        }
        cout << min(last1+s1, last2+s2) << '\n';
    }
}
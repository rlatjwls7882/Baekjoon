#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int T; cin >> T;
    while(T-->0) {
        int n; cin >> n;
        
        string first[n];
        for(int i=0;i<n;i++) {
            cin >> first[i];
        }

        string second[n];
        for(int i=0;i<n;i++) {
            cin >> second[i];
        }

        string secret[n];
        for(int i=0;i<n;i++) {
            cin >> secret[i];
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(first[i].compare(second[j])==0) {
                    cout << secret[j] << " ";
                    break;
                }
            }
        }
        cout << '\n';
    }
}
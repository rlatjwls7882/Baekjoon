#include<bits/stdc++.h>
using namespace std;

string s;
string snupc = "snupc";
vector<vector<int>> arr(5);

bool chk(int l, int r, int cnt) {
    for(int i=0;i<5;i++) {
        l = lower_bound(arr[i].begin(), arr[i].end(), l)-arr[i].begin() + cnt-1;
        if(l>=arr[i].size() || arr[i][l]>r) return false;
        l = arr[i][l];
    }
    return true;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> s;
    for(int i=0;i<s.length();i++) arr[snupc.find(s[i])].push_back(i);

    int q; cin >> q;
    while(q--) {
        int a, b; cin >> a >> b;

        int left=0, right=s.length()/5;
        while(left<right) {
            int mid = (left+right+1)/2;
            if(chk(a-1, b-1, mid)) left=mid;
            else right=mid-1;
        }
        cout << left << '\n';
    }
}
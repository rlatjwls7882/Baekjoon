#include<bits/stdc++.h>
using namespace std;

const int MAX = 10'000'001;

bool exist[MAX];
int n, m, arr[7];

void back(int depth=0, string s="") {
    if(depth==n) {
        for(int i=0;i<m;i++) {
            bool chk=false;
            for(int j=0;j<n;j++) {
                if(arr[i]==s[j]-'0') chk=true;
            }
            if(!chk) return;
        }
        exist[stoi(s)]=true;
        return;
    }
    for(int i=0;i<=9;i++) back(depth+1, s+to_string(i));
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> m;
    for(int i=0;i<m;i++) cin >> arr[i];
    back();
    cout << accumulate(exist, exist+MAX, 0);
}
#include<bits/stdc++.h>
using namespace std;

int cnt;
string s;
int remain[26];
vector<int> last(10);

void back(int depth) {
    if(depth==s.length()) {
        cnt++;
        return;
    }
    for(int i=0;i<26;i++) {
        if(remain[i] && (depth==0 || last[depth-1]!=i)) {
            remain[i]--;
            last[depth]=i;
            back(depth+1);
            remain[i]++;
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> s;
    for(int i=0;i<s.length();i++) {
        remain[s[i]-'a']++;
    }
    back(0);
    cout << cnt;
}
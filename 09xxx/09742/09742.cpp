#include<bits/stdc++.h>
using namespace std;

string s;
int n, cnt;
bool visited[10];
char make[10];

void dfs(int depth) {
    if(depth==s.length()) {
        cnt++;
        if(cnt==n) return;
    }

    for(int i=0;i<s.length();i++) {
        if(cnt==n) return;
        if(!visited[i]) {
            visited[i]=true;
            make[depth]=s[i];
            dfs(depth+1);
            visited[i]=false;
        }
    }
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    while(true) {
        cin >> s >> n;
        if(cin.fail()) break;

        cnt=0;
        dfs(0);

        cout << s << " " << n << " = ";
        if(cnt<n) {
            cout << "No permutation";
        } else {
            for(int i=0;i<s.length();i++) {
                cout << make[i];
            }
        }
        cout << '\n';
    }
}
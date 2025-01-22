#include<bits/stdc++.h>
using namespace std;

const int S=1, E=2;
const int MAX = 10000;

char f[MAX][MAX];
short prv[MAX];
int k, n;

bool dfs(int cur) {
    if(cur%2==0) cout << ' ' << cur/2+1;
    if(cur==E) return true;
    for(int next=0;next<n*2;next++) {
        if(f[cur][next]==1) {
            f[cur][next]=0;
            if(dfs(next)) return true;
        }
    }
    return false;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    for(int tc=1;;tc++) {
        cin >> k >> n;
        if(k==0 && n==0) break;
        memset(f, 0, sizeof f);
        for(int i=0;i<n*2;i+=2) {
            f[i][i+1]=-1; // 짝수: 도착, 홀수: 출발
        }

        cin.ignore();
        for(int i=0;i<n;i++) {
            string s; getline(cin, s);
            s += ' ';
            int idx=0;
            while(idx<s.length()) {
                int nextIdx = s.find(' ', idx);
                int next = stoi(s.substr(idx, nextIdx-idx))-1;
                idx=nextIdx+1;
                if(i<next) {
                    int s1 = i*2+1, e1 = i*2;
                    int s2 = next*2+1, e2 = next*2;
                    f[s2][e1]=f[s1][e2]=-1;
                }
            }
        }

        int cnt=0;
        while(cnt<k) {
            memset(prv, -1, sizeof prv);
            queue<int> q; q.push(S);
            while(!q.empty() && prv[E]==-1) {
                int cur = q.front(); q.pop();
                for(int next=0;next<n*2;next++) {
                    if(-f[cur][next]>0 && prv[next]==-1) {
                        prv[next]=cur;
                        q.push(next);
                        if(next==E) break;
                    }
                }
            }
            if(prv[E]==-1) break;
            cnt++;

            for(int i=E;i!=S;i=prv[i]) {
                f[prv[i]][i]=1;
                f[i][prv[i]]=0;
            }
        }

        cout << "Case " << tc << ":\n";
        if(cnt<k) {
            cout << "Impossible\n";
        } else {
            while(k--) {
                cout << S;
                dfs(S);
                cout << '\n';
            }
        }
        cout << '\n';
    }
}
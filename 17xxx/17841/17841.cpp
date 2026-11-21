#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
ll MOD = 1000000007;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    ll before[5] = {0, };

    for(int i=0;i<N;i++) {
        string s; cin >> s;
        // 0 1  2   3    4     5 6  7    8   9 10 11 12 13 14
        // U UN UNI UNIS UNIST N NI NIS NIST I IS IST S ST T
        ll cur[15] = {0, };
        if(s[0]=='U') {
            cur[0]++;
            if(s[1]=='N') {
                cur[1]++;
                if(s[2]=='I') {
                    cur[2]++;
                    if(s[3]=='S') {
                        cur[3]++;
                        if(s[4]=='T') {
                            cur[4]++;
                        }
                    }
                }
            }
        } else if(s[0]=='N') {
            cur[5]++;
            if(s[1]=='I') {
                cur[6]++;
                if(s[2]=='S') {
                    cur[7]++;
                    if(s[3]=='T') {
                        cur[8]++;
                    }
                }
            }
        } else if(s[0]=='I') {
            cur[9]++;
            if(s[1]=='S') {
                cur[10]++;
                if(s[2]=='T') {
                    cur[11]++;
                }
            }
        } else if(s[0]=='S') {
            cur[12]++;
            if(s[1]=='T') {
                cur[13]++;
            }
        } else if(s[0]=='T') {
            cur[14]++;
        }

        cur[1] += before[0]*cur[5];
        cur[2] += before[0]*cur[6]+before[1]*cur[9];
        cur[3] += before[0]*cur[7]+before[1]*cur[10]+before[2]*cur[12];
        cur[4] += before[0]*cur[8]+before[1]*cur[11]+before[2]*cur[13]+before[3]*cur[14];
        for(int i=0;i<5;i++) {
            before[i] = (before[i]+cur[i])%MOD;
        }
    }
    cout << before[4];
}
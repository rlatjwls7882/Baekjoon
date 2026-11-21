#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t; cin >> t;
    while(t-->0) {
        int m; string s; cin >> m >> s;
        if(m==1) {
            int idx=0;
            string total="";
            for(int i=0;i<8;i++) {
                int nextIdx = s.find('.', idx);
                total += bitset<8>(stoull(s.substr(idx, nextIdx-idx))).to_string();
                idx = nextIdx+1;
            }
            cout << bitset<64>(total).to_ullong() << '\n';
        } else {
            unsigned long long N = stoull(s);
            vector<unsigned long long> res;
            for(int i=0;i<8;i++) {
                bitset<8> bit=0;
                for(int j=0;j<8;j++) {
                    if(N%2==1) bit[j]=1;
                    N/=2;
                }
                res.push_back(bit.to_ullong());
            }
            for(int j=7;j>=0;j--) {
                if(j!=7) cout << '.';
                cout << res[j];
            }
            cout << '\n';
        }
    }
}
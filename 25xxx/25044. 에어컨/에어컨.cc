#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, K; cin >> N >> K;

    int dd=0, hh=0, mm=0, cnt=0;
    int stopH[3] = {15, 18, 21}, stopM[3] = {0, };
    vector<string> res;
    while(dd<=N) {
        if(++mm==60) {
            mm=0;
            if(++hh==24) {
                hh=0;
                dd++;
            }
        }

        if(hh==stopH[0] && mm==stopM[0] || hh==stopH[1] && mm==stopM[1] || hh==stopH[2] && mm==stopM[2]) {
            if(dd==N) {
                string s="";
                if(hh<10) s+="0";
                s+=to_string(hh)+":";
                if(mm<10) s+="0";
                s+=to_string(mm);
                res.push_back(s);
            }
            if(++cnt==3) {
                cnt=0;
                for(int i=0;i<3;i++) {
                    stopM[i]+=K;
                    if(stopM[i]>=60) {
                        stopM[i]-=60;
                        if(++stopH[i]==24) {
                            stopH[i]=0;
                        }
                    }
                }
                mm+=K;
                if(mm>=60) {
                    mm-=60;
                    if(++hh==24) {
                        hh=0;
                        dd++;
                    }
                }
            }
        }
    }

    cout << res.size() << '\n';
    for(string val:res) {
        cout << val << '\n';
    }
}
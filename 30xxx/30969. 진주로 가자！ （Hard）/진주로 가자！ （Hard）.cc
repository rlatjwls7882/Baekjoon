#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    vector<short> v;
    int cnt=0;
    short jinjuCost=0;
    for(int i=0;i<N;i++) {
        string D; long long C; cin >> D >> C;
        if(jinjuCost==0 && D.compare("jinju")==0) {
            jinjuCost=C;
        }

        if(C>1000) {
            cnt++;
        } else if(jinjuCost==0) {
            v.push_back(C);
        } else {
            if(jinjuCost<C) {
                cnt++;
            }
        }
    }

    for(long long val:v) {
        if(jinjuCost<val) {
            cnt++;
        }
    }
    cout << jinjuCost << '\n' << cnt;
}
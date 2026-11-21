#include<bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    vector<int> diff;
    vector<int> val;
    while(N-->0) {
        int curVal; cin >> curVal;

        bool chk=false;
        for(int i=0;i<diff.size();i++) {
            if((curVal-val[i])%diff[i]==0) {
                chk=true;
                val[i]=curVal;
                break;
            }
        }
        if(!chk && curVal!=1) {
            diff.push_back(curVal-1);
            val.push_back(curVal);
        }
    }
    cout << diff.size();
}
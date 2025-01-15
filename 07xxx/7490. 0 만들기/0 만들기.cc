#include<bits/stdc++.h>
using namespace std;

int n;
vector<int> res;

void back(int depth=0) {
    if(depth==n) {
        int sum=0;
        for(int e:res) sum += e;
        if(sum==0) {
            for(int i=0;i<res.size();i++) {
                if(i!=0 && res[i]>0) cout << '+';
                else if(res[i]<0) cout << '-';
                string s = to_string(abs(res[i]));
                for(int j=0;j<s.length();j++) {
                    if(j!=0) cout << ' ';
                    cout << s[j];
                }
            }
            cout << '\n';
        }
        return;
    }

    // 수 이어 붙이기
    if(depth!=0) {
        if(res.back()>0) res.back() = res.back()*10+depth+1;
        else res.back() = res.back()*10-(depth+1);
        back(depth+1);
        res.back()/=10;
    }

    // +
    res.push_back(depth+1);
    back(depth+1);
    res.pop_back();

    // -
    if(depth!=0) {
        res.push_back(-(depth+1));
        back(depth+1);
        res.pop_back();
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t-->0) {
        cin >> n;
        back();
        cout << '\n';
    }
}
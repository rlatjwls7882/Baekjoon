#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;

    int s[n], e[n];
    for(int i=0;i<n;i++) {
        cin >> s[i] >> e[i];
    }

    bool up=false;
    int minVal=s[0], maxVal=e[0];
    for(int i=1;i<n;i++) {
        int nextMinVal = max(minVal, s[i]);
        int nextMaxVal = min(maxVal, e[i]);
        if(nextMinVal<=nextMaxVal) {
            minVal = nextMinVal;
            maxVal = nextMaxVal;
        } else {
            if(s[i]>maxVal) up=true;
            break;
        }
    }

    int cost=0;
    vector<int> res;
    int curVal;
    if(up) {
        res.push_back(maxVal);
        curVal = maxVal;
    } else {
        res.push_back(minVal);
        curVal = minVal;
    }

    for(int i=1;i<n;i++) {
        int nextVal=curVal;
        if(curVal<s[i]) nextVal = s[i];
        else if(curVal>e[i]) nextVal = e[i];

        res.push_back(nextVal);
        cost += abs(nextVal-curVal);
        curVal = nextVal;
    }

    cout << cost;
    for(int val:res) {
        cout << '\n' << val;
    }
}
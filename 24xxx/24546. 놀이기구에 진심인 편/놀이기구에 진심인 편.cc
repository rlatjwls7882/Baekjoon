#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
typedef vector<int> vi;
typedef vector<vi> vvi;

struct element {
    int y1, y2, val;
};

const int MAX=200'001, SZ=500;

int n, k, h, w, d, bucTot[SZ], buc[SZ], arr[MAX];
vector<vector<element>> v(MAX);
vvi bucArr(SZ, vi(MAX));

void update(int l, int r, int val) {
    while(l%SZ && l<=r) {
        bucArr[l/SZ][arr[l]]--;
        arr[l]+=val;
        bucArr[l/SZ][arr[l]]++;
        if(val==1 && arr[l]==k-buc[l/SZ]) bucTot[l/SZ]++;
        else if(val==-1 && arr[l]==k-buc[l/SZ]-1) bucTot[l/SZ]--;
        l++;
    }
    while(r%SZ!=SZ-1 && l<=r) {
        bucArr[r/SZ][arr[r]]--;
        arr[r]+=val;
        bucArr[r/SZ][arr[r]]++;
        if(val==1 && arr[r]==k-buc[r/SZ]) bucTot[r/SZ]++;
        else if(val==-1 && arr[r]==k-buc[r/SZ]-1) bucTot[r/SZ]--;
        r--;
    }
    while(l<=r) {
        buc[l/SZ]+=val;
        if(val==1 && k-buc[l/SZ]>=0) bucTot[l/SZ]+=bucArr[l/SZ][k-buc[l/SZ]];
        else if(val==-1 && k-buc[l/SZ]-1>=0) bucTot[l/SZ]-=bucArr[l/SZ][k-buc[l/SZ]-1];
        l+=SZ;
    }
}

int query() {
    ll ret=0, l=0, r=MAX-1;
    while(l%SZ && l<=r) {
        ret += arr[l]+buc[l/SZ]>=k;
        l++;
    }
    while(r%SZ!=SZ-1 && l<=r) {
        ret += arr[r]+buc[r/SZ]>=k;
        r--;
    }
    while(l<=r) {
        ret += bucTot[l/SZ];
        l+=SZ;
    }
    return ret;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    cin >> n >> k >> h >> w >> d;
    for(int i=0;i<SZ;i++) bucArr[i][0]=SZ;
    while(n--) {
        int x1, x2, y1, y2; cin >> x1 >> x2 >> y1 >> y2;
        if(h-d>x2 || h+d<x1 || w-d>y2 || w+d<y1) continue;
        v[max(h-d, x1)].push_back({max(w-d, y1), min(w+d, y2), 1});
        v[min(h+d, x2)+1].push_back({max(w-d, y1), min(w+d, y2), -1});
    }

    ll res=0;
    for(int x=0;x<MAX;x++) {
        for(auto e:v[x]) update(e.y1, e.y2, e.val);
        res += query();
    }
    cout << res;
}
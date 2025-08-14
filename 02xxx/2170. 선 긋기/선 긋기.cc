#include<bits/stdc++.h>
using namespace std;

const int INF = 0x3f3f3f3f;

struct line {
    int left, right;
    bool operator<(const line l) const {
        return left < l.left;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    vector<line> lines(n);
    for(int i=0;i<n;i++) cin >> lines[i].left >> lines[i].right;
    sort(lines.begin(), lines.end());

    int sum=0, left=-INF, right=-INF;
    for(line l : lines) {
        if(l.left<=right) {
            right = max(right, l.right);
        } else {
            sum += right-left;
            left = l.left;
            right = l.right;
        }
    }
    sum += right-left;

    cout << sum;
}
#include <bits/stdc++.h>
using namespace std;
typedef pair<int, string> P;

bool comp(P a, P b) {
    return a.second<b.second;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string num[10] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    int M, N; cin >> M >> N;

    vector<P> v;
    for(int i=M;i<=N;i++) {
        string tmp = "";
        if(i>=10) tmp = num[i/10] + " ";
        tmp += num[i%10];
        v.push_back(P(i, tmp));
    }
    sort(v.begin(), v.end(), comp);

    for(int i=0;i<v.size();i++) {
        cout << v[i].first << " ";
        if(i%10==9) cout << '\n';
    }
}
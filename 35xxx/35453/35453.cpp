#include<bits/stdc++.h>
using namespace std;

map<int, string> li = {
    {232, "2017"},
    {88, "2018"},
    {754, "2019"},
    {29, "2020"},
    {28, "2021"},
    {1015, "2022"},
    {1295, "2023"},
    {1073, "2024"},
    {348, "2025"},
};

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int t; cin >> t;
    while(t--) {
        int n; cin >> n;
        int res=1;
        while(n--) {
            string s; cin >> s;
            res*=s.size();
        }
        cout << (li.count(res) ? li[res] : "Goodbye, ChAOS!") << '\n';
    }
}

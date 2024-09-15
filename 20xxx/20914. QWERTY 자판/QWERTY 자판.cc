#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    vector<vector<int>> conn(26);
    conn['Q'-'A'].push_back('A'-'A');
    conn['Q'-'A'].push_back('W'-'A');

    conn['W'-'A'].push_back('Q'-'A');
    conn['W'-'A'].push_back('A'-'A');
    conn['W'-'A'].push_back('S'-'A');
    conn['W'-'A'].push_back('E'-'A');

    conn['E'-'A'].push_back('W'-'A');
    conn['E'-'A'].push_back('S'-'A');
    conn['E'-'A'].push_back('D'-'A');
    conn['E'-'A'].push_back('R'-'A');

    conn['R'-'A'].push_back('E'-'A');
    conn['R'-'A'].push_back('D'-'A');
    conn['R'-'A'].push_back('F'-'A');
    conn['R'-'A'].push_back('T'-'A');

    conn['T'-'A'].push_back('R'-'A');
    conn['T'-'A'].push_back('F'-'A');
    conn['T'-'A'].push_back('G'-'A');
    conn['T'-'A'].push_back('Y'-'A');

    conn['Y'-'A'].push_back('T'-'A');
    conn['Y'-'A'].push_back('G'-'A');
    conn['Y'-'A'].push_back('H'-'A');
    conn['Y'-'A'].push_back('U'-'A');

    conn['U'-'A'].push_back('Y'-'A');
    conn['U'-'A'].push_back('H'-'A');
    conn['U'-'A'].push_back('J'-'A');
    conn['U'-'A'].push_back('I'-'A');

    conn['I'-'A'].push_back('U'-'A');
    conn['I'-'A'].push_back('J'-'A');
    conn['I'-'A'].push_back('K'-'A');
    conn['I'-'A'].push_back('O'-'A');

    conn['O'-'A'].push_back('I'-'A');
    conn['O'-'A'].push_back('K'-'A');
    conn['O'-'A'].push_back('L'-'A');
    conn['O'-'A'].push_back('P'-'A');

    conn['P'-'A'].push_back('O'-'A');
    conn['P'-'A'].push_back('L'-'A');

    conn['A'-'A'].push_back('Q'-'A');
    conn['A'-'A'].push_back('W'-'A');
    conn['A'-'A'].push_back('S'-'A');
    conn['A'-'A'].push_back('Z'-'A');

    conn['S'-'A'].push_back('W'-'A');
    conn['S'-'A'].push_back('A'-'A');
    conn['S'-'A'].push_back('Z'-'A');
    conn['S'-'A'].push_back('X'-'A');
    conn['S'-'A'].push_back('D'-'A');
    conn['S'-'A'].push_back('E'-'A');

    conn['D'-'A'].push_back('E'-'A');
    conn['D'-'A'].push_back('S'-'A');
    conn['D'-'A'].push_back('X'-'A');
    conn['D'-'A'].push_back('C'-'A');
    conn['D'-'A'].push_back('F'-'A');
    conn['D'-'A'].push_back('R'-'A');

    conn['F'-'A'].push_back('R'-'A');
    conn['F'-'A'].push_back('D'-'A');
    conn['F'-'A'].push_back('C'-'A');
    conn['F'-'A'].push_back('V'-'A');
    conn['F'-'A'].push_back('G'-'A');
    conn['F'-'A'].push_back('T'-'A');

    conn['G'-'A'].push_back('T'-'A');
    conn['G'-'A'].push_back('F'-'A');
    conn['G'-'A'].push_back('V'-'A');
    conn['G'-'A'].push_back('B'-'A');
    conn['G'-'A'].push_back('H'-'A');
    conn['G'-'A'].push_back('Y'-'A');

    conn['H'-'A'].push_back('Y'-'A');
    conn['H'-'A'].push_back('G'-'A');
    conn['H'-'A'].push_back('B'-'A');
    conn['H'-'A'].push_back('N'-'A');
    conn['H'-'A'].push_back('J'-'A');
    conn['H'-'A'].push_back('U'-'A');

    conn['J'-'A'].push_back('U'-'A');
    conn['J'-'A'].push_back('H'-'A');
    conn['J'-'A'].push_back('N'-'A');
    conn['J'-'A'].push_back('M'-'A');
    conn['J'-'A'].push_back('K'-'A');
    conn['J'-'A'].push_back('I'-'A');

    conn['K'-'A'].push_back('I'-'A');
    conn['K'-'A'].push_back('J'-'A');
    conn['K'-'A'].push_back('M'-'A');
    conn['K'-'A'].push_back('L'-'A');
    conn['K'-'A'].push_back('O'-'A');

    conn['L'-'A'].push_back('O'-'A');
    conn['L'-'A'].push_back('K'-'A');
    conn['L'-'A'].push_back('P'-'A');

    conn['Z'-'A'].push_back('A'-'A');
    conn['Z'-'A'].push_back('S'-'A');
    conn['Z'-'A'].push_back('X'-'A');

    conn['X'-'A'].push_back('S'-'A');
    conn['X'-'A'].push_back('Z'-'A');
    conn['X'-'A'].push_back('D'-'A');
    conn['X'-'A'].push_back('C'-'A');

    conn['C'-'A'].push_back('X'-'A');
    conn['C'-'A'].push_back('D'-'A');
    conn['C'-'A'].push_back('F'-'A');
    conn['C'-'A'].push_back('V'-'A');

    conn['V'-'A'].push_back('C'-'A');
    conn['V'-'A'].push_back('F'-'A');
    conn['V'-'A'].push_back('G'-'A');
    conn['V'-'A'].push_back('B'-'A');

    conn['B'-'A'].push_back('V'-'A');
    conn['B'-'A'].push_back('G'-'A');
    conn['B'-'A'].push_back('H'-'A');
    conn['B'-'A'].push_back('N'-'A');

    conn['N'-'A'].push_back('B'-'A');
    conn['N'-'A'].push_back('H'-'A');
    conn['N'-'A'].push_back('J'-'A');
    conn['N'-'A'].push_back('M'-'A');

    conn['M'-'A'].push_back('N'-'A');
    conn['M'-'A'].push_back('J'-'A');
    conn['M'-'A'].push_back('K'-'A');

    int T; cin >> T;
    while(T-->0) {
        string s; cin >> s;
        int cnt = s.length();
        for(int i=1;i<s.length();i++) {
            queue<pair<int, int>> q; q.push({s[i-1]-'A', 0});
            bool visited[26] = {false, }; visited[s[i-1]-'A']=true;
            while(!q.empty()) {
                pair<int, int> cur = q.front(); q.pop();
                if(cur.first == s[i]-'A') {
                    cnt += cur.second;
                    break;
                }
                for(int next:conn[cur.first]) {
                    if(!visited[next]) {
                        visited[next]=true;
                        q.push({next, cur.second+2});
                    }
                }
            }
        }
        cout << cnt << '\n';
    }
}
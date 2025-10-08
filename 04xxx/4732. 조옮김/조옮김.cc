#include<bits/stdc++.h>
using namespace std;

unordered_map<string, int> sound = {
    {"A", 0},
    {"A#", 1},
    {"Bb", 1},
    {"B", 2},
    {"B#", 3},
    {"Cb", 2},
    {"C", 3},
    {"C#", 4},
    {"Db", 4},
    {"D", 5},
    {"D#", 6},
    {"Eb", 6},
    {"E", 7},
    {"E#", 8},
    {"Fb", 7},
    {"F", 8},
    {"F#", 9},
    {"Gb", 9},
    {"G", 10},
    {"G#", 11},
    {"Ab", 11},
};

string res[12] = {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    while(true) {
        string s; getline(cin, s);
        if(s=="***") break;
        int n; cin >> n;
        cin.ignore();

        s += " ";
        int idx=0;
        while(idx<s.length()) {
            int nextIdx = s.find(' ', idx);
            cout << res[(sound[s.substr(idx, nextIdx-idx)]+12000000+n)%12] << ' ';
            idx = nextIdx+1;
        }
        cout << '\n';
    }
}
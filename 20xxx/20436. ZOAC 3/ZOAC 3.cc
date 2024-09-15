#include <bits/stdc++.h>
using namespace std;
typedef pair<int, int> P;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);

    unordered_map<char, P> l = {
        {'q', {0, 0}}, {'w', {0, 1}}, {'e', {0, 2}}, {'r', {0, 3}}, {'t', {0, 4}},
        {'a', {1, 0}}, {'s', {1, 1}}, {'d', {1, 2}}, {'f', {1, 3}}, {'g', {1, 4}},
        {'z', {2, 0}}, {'x', {2, 1}}, {'c', {2, 2}}, {'v', {2, 3}}
    };

    unordered_map<char, P> r = {
        {'y', {0, 5}}, {'u', {0, 6}}, {'i', {0, 7}}, {'o', {0, 8}}, {'p', {0, 9}},
        {'h', {1, 5}}, {'j', {1, 6}}, {'k', {1, 7}}, {'l', {1, 8}}, {'b', {2, 4}},
        {'n', {2, 5}}, {'m', {2, 6}}
    };

    char sl, sr; cin >> sl >> sr;
    string s; cin >> s;

    P posL = l[sl], posR = r[sr];
    int sum = s.length();

    for (char c : s) {
        if (l.count(c)) {
            P nextPos = l[c];
            sum += abs(posL.first - nextPos.first) + abs(posL.second - nextPos.second);
            posL = nextPos;
        } else {
            P nextPos = r[c];
            sum += abs(posR.first - nextPos.first) + abs(posR.second - nextPos.second);
            posR = nextPos;
        }
    }
    cout << sum;
}
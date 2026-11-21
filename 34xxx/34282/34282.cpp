#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    double x, y, z; cin >> x >> y >> z;
    double score = x/4+y/4+z/2;
    if(score>=90) cout << "A";
    else if(score>=80) cout << "B";
    else if(score>=70) cout << "C";
    else if(score>=60) cout << "D";
    else cout << "F";
}
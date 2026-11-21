#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int N; cin >> N;

    vector<int> v;
    int lastVal; cin >> lastVal;
    v.push_back(lastVal);
    while(N-->1) {
        int curVal; cin >> curVal;
        if(lastVal<curVal) {
            v.push_back(curVal);
            lastVal=curVal;
        }
    }

    cout << v.size() << endl;
    for(int i=0;i<v.size();i++) {
        cout << v[i] << " ";
    }
}
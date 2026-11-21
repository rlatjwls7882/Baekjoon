#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int t; cin >> t;

    int cost[5] = {50, 20, 10, 5, 1};
    while(t-->0) {
        double a, b; cin >> a >> b;
        int money = (b-a);

        for(int i=0;i<5;i++) {
            cout << money/cost[i] <<"-$" << cost[i];
            money %= cost[i];
            if(i<4) {
                cout << ", ";
            }
        }
        cout << endl;
    }
}
#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int s; string n; cin >> s >> n;

    string num[5][10] = {
        {" - ", "   ", " - ", " - ", "   ", " - ", " - ", " - ", " - ", " - "},
        {"| |", "  |", "  |", "  |", "| |", "|  ", "|  ", "  |", "| |", "| |"},
        {"   ", "   ", " - ", " - ", " - ", " - ", " - ", "   ", " - ", " - "},
        {"| |", "  |", "|  ", "  |", "  |", "  |", "| |", "  |", "| |", "  |"},
        {" - ", "   ", " - ", " - ", "   ", " - ", " - ", "   ", " - ", " - "},
        };
    
    for(int i=0;i<5;i++) {
        if(i==1 || i==3) {
            for(int repeatRow=0;repeatRow<s;repeatRow++) {
                for(int j=0;j<n.length();j++) {
                    for(int k=0;k<3;k++) {
                        if(k==1) {
                            for(int repeatCol=0;repeatCol<s;repeatCol++) {
                                cout << num[i][n[j]-'0'][k];
                            }
                        } else {
                            cout << num[i][n[j]-'0'][k];
                        }
                    }
                    cout << ' ';
                }
                cout << '\n';
            }
        } else {
            for(int j=0;j<n.length();j++) {
                for(int k=0;k<3;k++) {
                    if(k==1) {
                        for(int repeatCol=0;repeatCol<s;repeatCol++) {
                            cout << num[i][n[j]-'0'][k];
                        }
                    } else {
                        cout << num[i][n[j]-'0'][k];
                    }
                }
                cout << ' ';
            }
            cout << '\n';
        }
    }
}
#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    double MAX = 365;

    unordered_map<string, int> m = {
        {"January", 1}, {"February", 2},
        {"March", 3}, {"April", 4},
        {"May", 5}, {"June", 6},
        {"July", 7}, {"August", 8},
        {"September", 9}, {"October", 10},
        {"November", 11}, {"December", 12},
    };
    string mon; cin >> mon;
    string day; cin >> day;
    int d = (day[0]-'0')*10+day[1]-'0';
    int year; cin >> year;
    string time; cin >> time;
    int t = ((time[0]-'0')*10+time[1]-'0')*60+(time[3]-'0')*10+time[4]-'0';

    if(year%400==0 || year%4==0&&year%100!=0) MAX++;

    double CUR=0;
    int curMon = m[mon];
    for(int i=1;i<curMon;i++) {
        if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12) CUR+=31;
        else if(i==4 || i==6 || i==9 || i==11) CUR+=30;
        else if(MAX==365) CUR+=28;
        else CUR+=29;
    }
    CUR += d-1;

    MAX *= 24*60;
    CUR = CUR*24*60 + t;

    cout << fixed;
    cout.precision(9);
    cout << CUR/MAX*100;
}
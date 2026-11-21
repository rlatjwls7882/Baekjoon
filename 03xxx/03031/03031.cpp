#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    while(N-->0) {
        int arr[5], cnt=0;
        for(int i=0;i<5;i++) {
            string s; cin >> s;
            if(s[0]=='?') {
                arr[i]=-1;
                cnt++;
            }
            else arr[i]=stoi(s);
        }
        if(cnt==1) {
            if(arr[0]==-1) arr[0]=arr[1]+arr[2]+arr[3];
            else if(arr[1]==-1) arr[1]=arr[0]-arr[2]-arr[3];
            else if(arr[2]==-1) arr[2]=arr[0]-arr[1]-arr[3];
            else if(arr[3]==-1) arr[3]=arr[0]-arr[1]-arr[2];
            else arr[4] = arr[1]*3+arr[2];
        } else if(cnt==2) {
            if(arr[0]==-1) {
                if(arr[1]==-1) arr[1] = (arr[4]-arr[2])/3;
                else if(arr[2]==-1) arr[2] = arr[4]-arr[1]*3;
                else if(arr[3]==-1) arr[3]=0;
                else if(arr[4]==-1) arr[4] = arr[1]*3+arr[2];
                arr[0] = arr[1]+arr[2]+arr[3];
            } else if(arr[1]==-1) {
                if(arr[2]==-1) {
                    for(int i=0;i<=arr[0]-arr[3];i++) {
                        if(i*3+arr[0]-arr[3]-i==arr[4]) {
                            arr[1]=i;
                            arr[2]=arr[0]-arr[3]-i;
                            break;
                        }
                    }
                } else if(arr[3]==-1) {
                    arr[1] = (arr[4]-arr[2])/3;
                    arr[3] = arr[0]-arr[1]-arr[2];
                } else {
                    arr[1]=arr[0]-arr[2]-arr[3];
                    arr[4]=arr[1]*3+arr[2];
                }
            } else if(arr[2]==-1) {
                if(arr[3]==-1) {
                    arr[2]=arr[4]-arr[1]*3;
                    arr[3]=arr[0]-arr[1]-arr[2];
                } else {
                    arr[2]=arr[0]-arr[1]-arr[3];
                    arr[4]=arr[1]*3+arr[2];
                }
            } else {
                arr[3]=arr[0]-arr[1]-arr[2];
                arr[4]=arr[1]*3+arr[2];
            }
        } else if(cnt==3) {
            if(arr[0]==-1 && arr[1]==-1 && arr[2]==-1) {
                for(int i=0;i<=100-arr[3];i++) {
                    for(int j=0;i+j<=100-arr[3];j++) {
                        if(i*3+j==arr[4]) {
                            arr[0]=i+j+arr[3];
                            arr[1]=i;
                            arr[2]=j;
                            i=j=1000;
                            break;
                        }
                    }
                }
            } else if(arr[0]==-1 && arr[1]==-1 && arr[3]==-1) {
                arr[0]=100;
                arr[1]=(arr[4]-arr[2])/3;
                arr[3]=0;
            } else if(arr[0]==-1 && arr[1]==-1 && arr[4]==-1) {
                arr[0]=100;
                arr[1]=0;
                arr[4]=arr[2];
            } else if(arr[0]==-1 && arr[2]==-1 && arr[3]==-1) {
                arr[2]=arr[4]-arr[1]*3;
                arr[3]=100-arr[1]-arr[2];
                arr[0]=100;
            } else if(arr[0]==-1 && arr[2]==-1 && arr[4]==-1) {
                arr[0]=100;
                arr[2]=100-arr[3]-arr[1];
                arr[4]=arr[1]*3+arr[2];
            } else if(arr[0]==-1 && arr[3]==-1 && arr[4]==-1) {
                arr[0]=arr[1]+arr[2];
                arr[3]=0;
                arr[4]=arr[1]*3+arr[2];
            } else if(arr[1]==-1 && arr[2]==-1 && arr[3]==-1) {
                for(int i=0;i<=arr[0];i++) {
                    for(int j=0;i+j<=arr[0];j++) {
                        if(i*3+j==arr[4]) {
                            arr[1]=i;
                            arr[2]=j;
                            arr[3]=arr[0]-i-j;
                            i=j=1000;
                            break;
                        }
                    }
                }
            } else if(arr[1]==-1 && arr[2]==-1 && arr[4]==-1) {
                arr[1]=arr[2]=arr[4]=0;
            } else if(arr[1]==-1 && arr[3]==-1 && arr[4]==-1) {
                arr[1]=arr[3]=0;
                if(arr[0]==0) arr[4]=0;
                else arr[4]=100;
            } else {
                arr[2]=arr[3]=0;
                arr[4]=arr[1]*3;
            }
        } else if(cnt==4) {
            if(arr[0]!=-1) {
                arr[1]=arr[2]=arr[3]=arr[4]=0;
            } else if(arr[1]!=-1) {
                arr[0]=100;
                arr[2]=arr[3]=0;
                arr[4]=300;
            } else if(arr[2]!=-1) {
                arr[0]=100;
                arr[1]=arr[3]=0;
                arr[4]=100;
            } else if(arr[3]!=-1) {
                arr[0]=100;
                arr[1]=arr[2]=arr[4]=0;
            } else {
                for(int i=0;i<=100;i++) {
                    for(int j=0;i+j<=100;j++) {
                        if(i*3+j==arr[4]) {
                            arr[0]=i+j;
                            arr[1]=i;
                            arr[2]=j;
                            arr[3]=0;
                            i=j=1000;
                            break;
                        }
                    }
                }
            }
        }
        
        for(int i=0;i<5;i++) {
            cout << arr[i] << ' ';
        }
        cout << '\n';
    }
}
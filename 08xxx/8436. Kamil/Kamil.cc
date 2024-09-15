#include <iostream>
#include <string>

using namespace std;

int main() {
  string str;
  getline(cin, str);

  int cnt = 1;
  for (int i = 0; i < str.length(); i++) {
    if (str[i] == 'T' || str[i] == 'D' || str[i] == 'L' || str[i] == 'F') {
      cnt *= 2;
    }
  }
  cout << cnt;
}
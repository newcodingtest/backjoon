//1984kb, 0ms
#include <iostream>
using namespace std;

// -가 나오면 그 이후는 -든 +든 무조건 -를 해주면 됨

int main()
{
	cin.sync_with_stdio(0);
	cin.tie(0); cout.tie(0);
	string s; cin >> s;
	int num = 0, result = 0;
	int size = s.size();
	bool isMinus = false; //-가 등장했는지 여부
	for (int i = 0; i < size; ++i)
	{
		if (s[i] == '+' || s[i] == '-')
		{
			if (!isMinus)
				result += num;
			else
				result -= num;
			num = 0;
			if (s[i] == '-')
				isMinus = true;
		}
		else //숫자연산부분
		{
			num *= 10;
			num += s[i] - '0';
		}
	}
	if (!isMinus)
		result += num;
	else
		result -= num;
	cout << result << endl;

	return 0;
}
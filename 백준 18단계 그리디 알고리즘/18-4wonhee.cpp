//1984kb, 0ms
#include <iostream>
using namespace std;

// -�� ������ �� ���Ĵ� -�� +�� ������ -�� ���ָ� ��

int main()
{
	cin.sync_with_stdio(0);
	cin.tie(0); cout.tie(0);
	string s; cin >> s;
	int num = 0, result = 0;
	int size = s.size();
	bool isMinus = false; //-�� �����ߴ��� ����
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
		else //���ڿ���κ�
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
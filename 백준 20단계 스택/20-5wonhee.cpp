//2512kb, 20ms
#include<iostream>
#include<stack>
#include<vector>
using namespace std;

int main()
{
	cin.sync_with_stdio(0);
	cin.tie(0); cout.tie(0);
	stack<int> s; //1���� ������� Ǫ���� ���ú���
	int cnt = 1; //���ÿ� �� ���ں���
	int N; cin >> N;
	bool c = true; //�������� üũ�� ����
	vector<char> v; //+ - ���� ����
	for (int i = 0; i < N; i++)
	{
		int num; cin >> num;
		while (s.empty() || s.top() < num) //num���� push
		{
			s.push(cnt);
			++cnt;
			v.push_back('+');
		}
		while (!s.empty() && s.top() > num) //num������ pop
		{
			s.pop();
			v.push_back('-');
		}

		//�̶� ������ top�� �Է¹��� num�� ���ƾ��Ѵ�.
		if (s.empty()||s.top() != num)
		{
			c = false;
			break;
		}
		s.pop();
		v.push_back('-');
	}
	if (c == false)
		cout << "NO" << '\n';
	else
		for (int i = 0; i < v.size(); i++)
			cout << v[i] << '\n';

	return 0;
}
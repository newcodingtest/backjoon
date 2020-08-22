//1988kb, 0ms
#include<iostream>
#include<stack>
using namespace std;

//���ڿ��� ���������� �����ϸ鼭 (�̸� �����ϰ� )�̸� ������ ������ (�� �����Ѵ�.
//���ڿ� ��ȸ ���� )�ε� ����� (�� ���ų� ���ڿ��� ��� ��ȸ������ (�� �����ִٸ� NO
//�ƴ϶�� YES

int main()
{
	cin.sync_with_stdio(0);
	cin.tie(0); cout.tie(0);
	int N; cin >> N;
	for (int i = 0; i < N; i++)
	{
		stack<char> s;
		string sin; cin >> sin;
		bool c = true;
		for (int i = 0; i < sin.size(); i++)
		{
			if (sin[i] == '(')
				s.push('(');
			else
			{
				if (s.empty() || s.top() == ')')
				{
					c = false;
					break;
				}
				s.pop();
			}
		}
		if (!s.empty())
			c = false;

		if (c == true)
			cout << "YES" << '\n';
		else
			cout << "NO" << '\n';
	}
	return 0;
}
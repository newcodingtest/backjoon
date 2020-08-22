//1988kb, 4ms
#include<iostream>
#include<stack>
#include<string>
using namespace std;

// ���� �Է¹��� ���ڿ��� (�� [��� stack�� �߰�
// )�� ]��� ��ȣ ��Ī�Ǵ��� stack.top()����
// �ٸ� ���ڵ��� ��ŵ

int main()
{
	cin.sync_with_stdio(0);
	cin.tie(0); cout.tie(0);
	while (1)
	{
		string st; getline(cin,st);
		if (st == ".")
			break;
		stack<char> s;
		bool c = true;
		for (int i = 0; i < st.size(); i++)
		{
			if (st[i] == '(' || st[i] == '[')
				s.push(st[i]);
			else if (st[i] == ')')
			{
				if (s.empty() || s.top() != '(')
				{
					c = false;
					break;
				}
				else if (s.top() == '(')
					s.pop();
			}
			else if (st[i] == ']')
			{
				if (s.empty() || s.top() != '[')
				{
					c = false;
					break;
				}
				else if (s.top() == '[')
					s.pop();
			}
		}

		if (!s.empty())
			c = false;

		if (c == true)
			cout << "yes" << '\n';
		else
			cout << "no" << '\n';
	}
	return 0;
}
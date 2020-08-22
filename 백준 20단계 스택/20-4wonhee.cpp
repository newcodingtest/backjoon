//1988kb, 4ms
#include<iostream>
#include<stack>
#include<string>
using namespace std;

// 한줄 입력받은 문자열중 (나 [라면 stack에 추가
// )나 ]라면 괄호 매칭되는지 stack.top()접근
// 다른 문자들은 스킵

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
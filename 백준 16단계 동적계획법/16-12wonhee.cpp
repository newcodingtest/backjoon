//1988kb, 8ms
#include<iostream> 
#include<vector>
#include<algorithm>
using namespace std;  
int N;
int A[1001]; //�Է� ���� ����

bool compare(int a, int b)
{
	return a > b;
}

int main() 
{
	cin.sync_with_stdio(0); 
	cin.tie(0); cout.tie(0);

	//�Է¹޴� �κ�
	cin >> N;
	for (int i = 0; i < N; i++)
		cin >> A[i];
	
	int result = 0;
	vector<int> inc_v; //�����ϴ� ������ ������ ����
	for (int i = 0; i < N; i++)
	{
		//�����ϴ� ���� ã��
		//������ ������ġ�� ���� ������ ������ ��ġ�� ������ ũ�� �ڿ� �߰�
		if (inc_v.empty()||inc_v.back() < A[i])
			inc_v.push_back(A[i]);
		//�׷��� ������ �ش��ϴ� ���� �� ��ġ�� ã�Ƽ� �־���
		else
		{
			int index = lower_bound(inc_v.begin(), inc_v.end(),A[i]) - inc_v.begin();
			inc_v[index] = A[i];
		}

		vector<int> dec_v;
		//�����ϴ� ���� ã��
		for (int j = i; j < N; j++)
		{
			//������ ������ġ�� ���� ������ ������ ��ġ�� ������ ������ �ڿ� �߰�
			if (dec_v.empty()||dec_v.back() > A[j])
				dec_v.push_back(A[j]);
			//�׷��� ������ �ش��ϴ� ���� �� ��ġ�� ã�Ƽ� �־���
			else
			{
				int index = lower_bound(dec_v.begin(), dec_v.end(), A[j],compare) - dec_v.begin();
				dec_v[index] = A[j];
			}
		}

		//������� ������ �ִ���� ã��
		//���������� ���Ҽ��� ���Ϳ� �������� ���°� �ϳ� �����Ƿ� ���ش�.
		result = max(result, (int)(inc_v.size() + dec_v.size()) - 1);
	}
	cout << result;
	return 0; 
}
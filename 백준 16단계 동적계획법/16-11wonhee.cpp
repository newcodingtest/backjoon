//1988kb, 0ms
#include<iostream> 
#include<vector>
#include<algorithm>
using namespace std;  
int N;
int A[1001]; //�Է� ���� ����
vector<int> v; //�����ϴ� ������ ������ ����

int main() 
{
	cin.sync_with_stdio(0); 
	cin.tie(0); cout.tie(0);

	//�Է¹޴� �κ�
	cin >> N;
	for (int i = 0; i < N; i++)
		cin >> A[i];
	
	v.push_back(A[0]);
	for (int i = 1; i < N; i++)
	{
		//������ ������ġ�� ���� ������ ������ ��ġ�� ������ ũ�� �ڿ� �߰�
		if (v.back() < A[i])
			v.push_back(A[i]);
		//�׷��� ������ �ش��ϴ� ���� �� ��ġ�� ã�Ƽ� �־���
		else
		{
			int index = lower_bound(v.begin(), v.end(),A[i]) - v.begin();
			v[index] = A[i];
		}
	}
	cout << v.size();
	return 0; 
}
package co.micol.prj;

public abstract class Animal { // �߻�Ŭ���� : �ϳ� �̻��� abstract �޼ҵ带 ���� �ְų� ����ִ� Ŭ����
	// Animal animal = new Animal(); �� ���Ѵ�. �ڱ� �ڽ��� �ν��Ͻ��� �Ұ���.
	public abstract void run();
	public void sleep() {
		System.out.println("���� ��ϴ�.");
	}
}

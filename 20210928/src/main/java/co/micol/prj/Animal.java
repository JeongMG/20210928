package co.micol.prj;

public abstract class Animal { // 추상클래스 : 하나 이상의 abstract 메소드를 갖고 있거나 비어있는 클래스
	// Animal animal = new Animal(); 을 못한다. 자기 자신을 인스턴스로 불가능.
	public abstract void run();
	public void sleep() {
		System.out.println("잠을 잡니다.");
	}
}

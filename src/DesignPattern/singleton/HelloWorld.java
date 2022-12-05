package DesignPattern.singleton;

public class HelloWorld {
    public static void main(String[] args) {
        // Singleton 클래스의 getInstance() 메서드를 통해 객체를 호출합니다. 즉, 두 객체는 같습니다.
        Singleton instA = Singleton.getInstance();
        Singleton instB = Singleton.getInstance();

        System.out.println(instA.hashCode()); // 두 객체의 해시코드를 통해 같은 객체임을 확인할 수 있습니다.
        System.out.println(instB.hashCode());

        // 또한 hashCode()를 재정의하지 않았으므로 해당 객체의 주소값을 해시화 하여 값을 가져오게 되고, 이를 통해 완전히 동일한 값임을 알 수 있습니다.
        if(instA == instB) System.out.println("동일한 객체입니다.");
    }
}

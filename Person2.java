public abstract class AbstractPerson {
	public abstract String getGender();

	public void speak() {
		System.out.println("I'm a " + getGender());

	}
}

public class Man extends AbstractPerson {
	public String getGender() {
		return MAN;
	}
}

public class Woman extends AbstractPerson {
	public String getGender() {
		return WOMAN;
	}
}

public class GenderSpeaker {
	public static void main(String[] args) {
		doSpeak(new Man());
		doSpeak(new Woman());
	}

	private static void doSpeak(AbstractPerson person) {
		person.speak();
	}
}
package lesson140325;

public class B extends A {
	
	{
		// инициализатор срабатывает до любого конструктора и присваивает значения
		state = 20;
	}
	
	@Override
	public void changeState() {
		state *= 10;
	}
	
}

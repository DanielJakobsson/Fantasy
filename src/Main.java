import model.Elf;
import model.Human;
import model.Orch;

public class Main {


	public static void main(String[] args) {
		
		Orch orch = new Orch();
		orch.print();
		Elf elf = new Elf();
		elf.print();
		Human human = new Human();
		human.print();

	}

}

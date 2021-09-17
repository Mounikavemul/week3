package commandfactorydesign.vitaminfactory;

public class VitaminFactoryTest {

	public static void main(String[] args) {
		Vitamin vitamin= new Vitamin();
		UserCommand userCommand=new UserCommand();
		userCommand.setCommand(new VitaminDosageCommand(vitamin));
		userCommand.executeCommand();
		
		userCommand.setCommand(new VitaminMedicineTypeCommand(vitamin));
		userCommand.executeCommand();
		
		userCommand.setCommand(new VitaminUserTypeCommand(vitamin));
		userCommand.executeCommand();
	}

}

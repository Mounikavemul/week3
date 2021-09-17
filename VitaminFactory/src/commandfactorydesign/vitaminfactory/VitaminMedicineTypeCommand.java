package commandfactorydesign.vitaminfactory;

public class VitaminMedicineTypeCommand implements Command{
	   Vitamin vitamin;
	   public VitaminMedicineTypeCommand(Vitamin vitamin)
	   {
		   this.vitamin=vitamin;
	   }
	@Override
	public void execute() {
		vitamin.chewables();
		vitamin.liquid();
		vitamin.pills();
	   }
}

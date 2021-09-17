package commandfactorydesign.vitaminfactory;

public class VitaminUserTypeCommand implements Command{
	Vitamin vitamin;
	   public VitaminUserTypeCommand(Vitamin vitamin)
	   {
		   this.vitamin=vitamin;
	   }
	@Override
	public void execute() {
		vitamin.adults();
		vitamin.kids();
	   }
}

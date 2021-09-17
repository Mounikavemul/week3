package commandfactorydesign.vitaminfactory;

public class VitaminDosageCommand implements Command{
   Vitamin vitamin;
   public VitaminDosageCommand(Vitamin vitamin)
   {
	   this.vitamin=vitamin;
   }
@Override
public void execute() {
	vitamin.dialy();
	vitamin.specialPurpose();	
   }
   
}

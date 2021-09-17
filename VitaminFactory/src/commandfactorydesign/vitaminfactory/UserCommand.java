package commandfactorydesign.vitaminfactory;
//Invoker Class
public class UserCommand {
   Command command;
   public void setCommand(Command command)
   {
	   this.command=command;
   }
   
   public void executeCommand() {
	   command.execute();
   }
	
}

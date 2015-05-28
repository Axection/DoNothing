import java.util.Scanner;
public class DoNothing {
	public interface nothing{
		public void doNothing(boolean conditional);
	}
	public class doingNothing implements nothing{
		public void doNothing(boolean conditional){
			// We check if they want to do nothing or not
			if(conditional==true){
				// Because they want to do nothing, we can do nothing without any doubt
				doNothing(false);
 			}else{
 				// Because they don't want to do nothing, nothing we can do here.
 				return;
 	}}}
	public static void didNothing(nothing toDo, boolean decision) {
		toDo.doNothing(decision);
		return;
	}
	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		System.out.print("Do you want to do nothing?");
		boolean decision = io.nextBoolean();
		if(decision == true){
			//Because they want to do nothing, let's do nothing!
			didNothing(new DoNothing().new doingNothing(), decision);
		}else{
			// Because they don't want to do nothing,
			// We have nothing to do here
			return;
}}}

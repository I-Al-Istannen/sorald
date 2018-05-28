import org.json.JSONArray;
import spoon.Launcher;
import spoon.processing.Processor;
import spoon.support.gui.SpoonModelTree;

public class Main {
	public static void main(String[] args) throws Exception
    {
//        JSONArray jsonArray=ParseAPI.parse(2259,"");
        JSONArray jsonArray=ParseAPI.parse(2259,"src/main/java/spoon/MavenLauncher.java");
		Launcher launcher = new Launcher();
		launcher.addInputResource("/home/ashutosh/TBCH/act/");
//		launcher.addInputResource("/home/ashutosh/TBCH/act/src/main/java/spoon/support/StandardEnvironment.java");
		launcher.addProcessor((Processor) new NullDereferenceProcessor(jsonArray));
		launcher.run();
//		new SpoonModelTree(launcher.getFactory());
		System.out.println("done");
	}
}
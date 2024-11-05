package requests;

import java.io.IOException;
import java.util.List;

//push statements in method/pull statements outside
public class Demo5 {

    void start(List<String> commands) throws IOException {
        checkCommands(commands);
        execute(commands);
        //same code here
    }

    void start(List<String> commands, List<String> vmOptions) throws IOException {
        checkCommands(commands);
        execute(commands);
        if (vmOptions.isEmpty()) return;
        for (String vmOption : vmOptions) {
            String[] option = vmOption.split("=");
            if (option.length == 2) {
                System.setProperty(option[0], option[1]);
            }
        }
        //same code here
    }

    private void execute(List<String> commands) throws IOException {
        Runtime.getRuntime().exec(commands.toArray(new String[0]));
    }

    private void checkCommands(List<String> commands) {
        for (String command : commands) {
            assert !command.isEmpty();
        }
    }
}

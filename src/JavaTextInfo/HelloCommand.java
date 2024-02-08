package JavaTextInfo;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(name = "hello", mixinStandardHelpOptions = true, version = "hello 1.0",
         description = "Prints a greeting message.")
public class HelloCommand implements Runnable {

    @Parameters(index = "0", description = "The name of the person to greet.")
    private String name;

    @Option(names = {"-g", "--greeting"}, description = "Custom greeting message.")
    private String greeting = "Hello";

    @Override
    public void run() {
        System.out.printf("%s, %s!%n", greeting, name);
    }

    public static void main(String[] args) {
        int exitCode = new picocli.CommandLine(new HelloCommand()).execute(args);
        System.exit(exitCode);
    }
}

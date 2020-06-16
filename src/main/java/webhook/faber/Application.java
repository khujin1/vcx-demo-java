package webhook.faber;

import org.apache.commons.cli.CommandLine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import utils.Common;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        //test
        // InitService.initialize () is automatically called when this application starts.
        SpringApplication.run(Application.class, args);

        //CommandLine options = Common.getCommandLine(args);
        //    if (options == null) System.exit(0);
    }
}

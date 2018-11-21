package ITSolutions.UserClient;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class UserClientApplication extends Application<UserClientConfiguration> {

    public static void main(final String[] args) throws Exception {
        new UserClientApplication().run(args);
    }

    @Override
    public String getName() {
        return "UserClient";
    }

    @Override
    public void initialize(final Bootstrap<UserClientConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final UserClientConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}

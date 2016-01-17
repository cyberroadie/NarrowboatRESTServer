package robotmotel;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import robotmotel.resources.PlayerResource;

public class RobotMotelApplication extends Application<RobotMotelConfiguration> {

    public static void main(final String[] args) throws Exception {
        new RobotMotelApplication().run(args);
    }

    @Override
    public String getName() {
        return "robotmotel";
    }

    @Override
    public void initialize(final Bootstrap<RobotMotelConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final RobotMotelConfiguration configuration,
                    final Environment environment) {
        final PlayerResource resource = new PlayerResource(
                configuration.getTemplate(),
                configuration.getDefaultName()
        );
        environment.jersey().register(resource);
    }

}

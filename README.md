# cloudformation-jenkins

A plugin to allow jenkins to build a cloudformation stack as a build step. This step will wait untilt he build/update suceeds/fails before continuing.

## Development

To launch jenkins with the plugin loaded, run:

    $ mvn hpi:run
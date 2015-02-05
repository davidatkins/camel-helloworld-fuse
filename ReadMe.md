#Camel Helloworld Fuse

Tested on jboss-fuse-6.1.0.redhat-379

##Deploying (Plain Fuse)

Can deploy into plain fuse (no fabric) in a bunch of ways:

###Via the deploy folder

This assumes you have the camel features already running on your container

<code>
cp target/camel-helloworld-fuse-1.0-SNAPSHOT.jar ~/Applications/jboss-fuse-6.1.0.redhat-379/deploy/
</code>

###Via command line osgi:install

This assumes you have the camel features already running on your container

<code>
osgi:install mvn:uk.co.davidatkins/camel-helloworld-fuse/1.0-SNAPSHOT
</code>

###Via karaf feature

This will ensure camel features are also running

<code>
features:addurl mvn:uk.co.davidatkins/camel-helloworld-fuse/${project.version}/xml/features
features:install davidatkins-camel-helloworld-fuse
</code>

##Deploying (Fabric)

TODO
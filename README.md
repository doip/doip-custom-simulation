# DoIP Custom Simulation 
This repository implements a DoIP simulation based on ISO 13400. It can be
seen as an example how to implement a DoIP simulation. Please feel free
to create a copy ofthis repository and adapt it to your needs.

# Build
The project used Gradle to build the software. The repository already includes 
the so called "Gradle Wrapper", so there is no need to install Gradle to 
build the project. The Gradle build tool will be automatically downloaded
on the first build. 

To build the project run in a command line the following command:

    ./gradlew build

This includes also execution of the unit tests. The result of the unit tests
can be found in the folder build/reports/tests/test/

The JAR file which had been build can be found in folder build/libs

The distribution package of the project can be found in folder 
build/distributions. This ZIP file or TAR file can be seen as a package what 
you can publish to the users to run the DoIP simulaton.

With the following command the distribution will be unpacked and provides
a setup where the simulation can be started directly:

    ./gradlew installDist

The unpacked distribution can then be found in the folder 
build/install/doip-simulation/

This folder contains the shell script start.sh. Just run the script from the 
command line and pass as first argument a property file which includes the
settings for the DoIP simulation. As an example there is the property file
gateway.properties. Inside this file there are additional comments
which describe each setting.

The distribution contains the compiled JAR file for the custom DoIP 
simulation and its dependencies. In addition all files which are located in
the folder src/main/dist will also be added to the distribution.

# Open Issues
* The settings for maxByteArraySizeLogging and maxByteArraySizeLookup are
  not yet used everywhere in the code
* There are still some TODOs in the source code. Please check source code
  for TODOs.

# Contact
In case of finding bugs, suggestions for improvement or change requests
please contact doip@wehnert.com



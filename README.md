# chemistry-opencmis-osgi-client-itest
chemistry-opencmis-osgi-client-itest

For testing CMIS-878.

## Setup
* Clone this repository locally and setup in eGit ("Git Repositories"-View)
* Inside Eclipse "Git Repositories"-View select "Import Projects ..."
* Select all five projects and import them
* Go to project "org.apache.chemistry.opencmis.client.osgi.target" and open the *.target file
* Inside the Target Definition editor select "Set as Target platform" at the top right.
* Go to project "org.apache.chemistry.opencmis.client.osgi.itest" and launch the launch-config "chemistry-opencmis-osgi-client-itest.launch" to start the framework
* You now can test by start/stop/install/uninstall bundles

A Migrate B2 Content to LTI Building Block
=====================

This project is based from the Spring Tool Suite (STS) Spring MVC project. We've added a bb-manifest.xml and an example of a view that uses the Blackboard Tags to render a page that has the look and feel of other Blackboard Learn pages.
Lastly, we've added code that uses the Logback Java APIs to create log files.

Note: To use the /coursetest action you must have created a course with the courseId mbk-test on your Learn system.

Credit to Shane Argo @ All the Ducks for the b2-logging-utils. Thank you Shane!
https://github.com/AllTheDucks/b2-logging-utils

Credit to Scott Hurrey for all the assistance getting this project to pre-compile JSP pages and insert them in the .war file.

### Clone to local repo

git clone https://github.com/mark-b-kauffman/bbdn-amib2lti.git bbdn-amib2lti

### Building
To build the project, just run:

gradle build

### Deploying
To deploy the B2 to your Learn server, use the Admin B2 Installation page.

MODIFY THE SCHEMA NAME (BBLEARN below) TO MATCH THAT OF THE SYSTEM YOU DEPLOY TO.
Home URL Example: `https://<hostname>/webapps/bbdn-amib2lti-BBLEARN/`
Learn Page URL Example: `https://<hostname>/webapps/bbdn-amib2lti-BBLEARN/learnhello`


A Migrate B2 Content to LTI Building Block
=====================
This project is a Work In Progress (WIP). It is intended to be used, eventually, by 3rd-party developers who modify it to work to covert their B2 content items, and items embedded in the Rich Text Editor of a Learn Origial course to native LTI launches to their server. At this time the only functionality is to show a settings page and a link on the Learn Admin page under Tools.

The project is based from the Spring Tool Suite (STS) Spring MVC project. We've added a bb-manifest.xml and an example of a view that uses the Blackboard Tags to render a page that has the look and feel of other Blackboard Learn pages.
Lastly, we've added code that uses the Logback Java APIs to create log files.

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

### Helpful Resources NOTE: All of the prior /archive docs are gone.
- https://docs.aws.amazon.com/corretto/latest/corretto-11-ug/macos-install.html
- brew install gradle@7
- [B2 API Overview](https://github.com/blackboard/blackboard.github.io/blob/Backup/learn/B2s/Building%20Blocks%20API%20Overview.md)
- [Make Your B2 SaaS and Newer Learn Version Compatible](https://github.com/blackboard/blackboard.github.io/blob/Backup/learn/B2s/Preparing%20Your%20Building%20Blocks%20For%20Learn%20SaaS%20and%20Newer%20Learn%20Versions.md)
- [B2 API Documentation](https://github.com/blackboard/blackboard.github.io/blob/Backup/learn/B2s/Building%20Block%20API%20Documentation.md)
- [Schema.xml Tutorial](https://github.com/blackboard/blackboard.github.io/blob/Backup/learn/B2s/Tutorial%20-%20Schema%20XML.md)
- [All B2 Docs](https://github.com/blackboard/blackboard.github.io/tree/Backup/learn/B2sd)


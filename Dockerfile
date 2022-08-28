From tomcat:8-jre8   

# copy war file on to container  

COPY ./target/team-2-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps

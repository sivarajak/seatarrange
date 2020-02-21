#$docker run -p 8080:8080 -p 50000:50000 -v /your/home:/var/jenkins_home jenkins
# we are extending everything from tomcat:8.0 image ...
FROM tomcat:8.0
MAINTAINER sivak
# COPY path-to-your-application-war path-to-webapps-in-docker-tomcat
COPY some-app/target/some-app.war /usr/local/tomcat/webapps/

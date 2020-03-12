FROM openjdk:8
MAINTAINER jc <1198564020@qq.com>
#ENV JAVA_OPTS -Dspring.profiles.active=local
ENV LANG en_US.utf8
ENV LC_ALL en_US.utf8
# VOLUME ["/data/logs"]
#update system timezone
RUN export LANG=en_US.utf8
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
#update application timezone \
RUN echo "Asia/Shanghai" >> /etc/timezone
# Add the service itself
#ARG JAR_FILE
ADD pom.xml /tmp/build/

ADD src /tmp/build/src

RUN cd /tmp/build && mvn clean package \
        && mv target/*.jar /app.jar \
        && cd / && rm -rf /tmp/build

VOLUME /tmp
#ADD entrypoint.sh /opt/entrypoint.sh
#RUN chmod +x /opt/entrypoint.sh
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
#ENTRYPOINT ["/opt/entrypoint.sh"]
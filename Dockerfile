#uygulama icin jre
FROM eclipse-temurin:21-jre-alpine

#proje jar dosyası
ARG JAR_FILE=target/demoDevops-0.0.1-SNAPSHOT.jar

#projenin jar hali docker ivine kopyala
COPY ${JAR_FILE} hsn_app.jar

#uygulama ic portu sabitle
EXPOSE 8080

#uygulamayı java komutla calistir.
ENTRYPOINT ["java","-jar","hsn_app.jar"]
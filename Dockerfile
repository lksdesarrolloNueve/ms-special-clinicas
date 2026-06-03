FROM maven:3.6.0-jdk-11-slim AS build
COPY src /home/ms-almacen/src
COPY pom.xml /home/ms-almacen
RUN mvn -f /home/ms-almacen/pom.xml clean package -DskipTests

FROM eclipse-temurin:11-jre

# Define la zona horaria como variable de entorno
ENV TZ=America/Mexico_City

# Instala las actualizaciones del sistema y el paquete necesario para configurar la zona horaria
RUN apt-get update && \
    DEBIAN_FRONTEND=noninteractive apt-get install -y tzdata && \
    apt-get clean

# Configura la zona horaria
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

# WORKDIR /home

COPY --from=build /home/ms-almacen/target/ms-almacen-0.0.1-SNAPSHOT.jar /usr/src/app/ms-almacen-0.0.1-SNAPSHOT.jar

#WORKDIR /app
#COPY target/ms-almacen-0.0.1-SNAPSHOT.jar /app
ENTRYPOINT ["java", "-jar", "/usr/src/app/ms-almacen-0.0.1-SNAPSHOT.jar"]

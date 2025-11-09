# Etapa 1: imagem base do Java
FROM eclipse-temurin:17-jdk

# Etapa 2: definir diretório de trabalho dentro do container
WORKDIR /app

# Etapa 3: copiar o arquivo JAR gerado para dentro da imagem
COPY target/simpleapi-0.0.1-SNAPSHOT.jar app.jar

# Etapa 4: expor a porta 8080
EXPOSE 8080

# Etapa 5: comando padrão para rodar o app
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
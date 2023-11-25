# Use uma imagem base do OpenJDK para Java 11
FROM openjdk:11-jre-slim

# Diretório de trabalho dentro do contêiner
WORKDIR /app

# Copie o JAR construído para o contêiner (substitua 'nome-do-seu-arquivo.jar' pelo nome real do seu arquivo JAR)
COPY target/nome-do-seu-arquivo.jar app.jar

# Exponha a porta em que a aplicação Spring Boot será executada
EXPOSE 8080

# Comando para executar a aplicação quando o contêiner for iniciado
CMD ["java", "-jar", "app.jar"]
